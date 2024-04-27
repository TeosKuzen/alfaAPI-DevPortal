package tests;

import helpers.Logger;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;

import javax.net.ssl.*;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.cert.X509Certificate;
import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class BaseTest {

    String downloadPath;
    String osName = System.getProperty("os.name").toLowerCase();
    WebDriver driver;
    DocumentationPage documentationPage;
    ChromeOptions options;
    WebDriverWait wait;
    BasePage basePage;
    LandingPage landingPage;
    FAQPage faqPage;
    Logger logger;
    ReleaseNotesPage releaseNotesPage;

    @BeforeEach
    public void setUp() {
        prepareDriver();
        documentationPage = new DocumentationPage();
        basePage = new BasePage();
        landingPage = new LandingPage();
        faqPage = new FAQPage();
        logger = new Logger();
        releaseNotesPage = new ReleaseNotesPage();
    }

    public void prepareDriver() {
        //если все же нужны будут настройки для safari, как на chrome, то исправлю
        if (osName.contains("mac")) {
            downloadPath = System.getProperty("user.home") + "/src/test/java/downloadedFiles";
            if (System.getProperty("browser", "safari").equals("safari")) {
                WebDriverManager.safaridriver().setup();
                driver = new SafariDriver();
            }
        } else if (osName.contains("windows")) {
            downloadPath = System.getProperty("user.dir") + "\\src\\test\\java\\downloadedFiles";
            if (System.getProperty("browser", "chrome").equals("chrome")) {
                HashMap<String, Object> chromePrefs = new HashMap<>();
                chromePrefs.put("profile.default_content_settings.popups", 0);
                chromePrefs.put("download.default_directory", downloadPath);
                chromePrefs.put("download.prompt_for_download", false);
                chromePrefs.put("safebrowsing.enabled", "false");
                chromePrefs.put("safebrowsing.disable_download_protection", "true");
                WebDriverManager.chromedriver().setup();
                options = new ChromeOptions();
                options.setExperimentalOption("prefs", chromePrefs);
                options.addArguments("--disable-infobars");
                options.addArguments("--disable-extensions");
                options.addArguments("--disable-notifications");
                options.addArguments("--start-fullscreen");
                options.addArguments("--disable-cache");
                options.addArguments("download.default_directory=" + downloadPath);
//            options.addArguments("--incognito"); //настройка блокирует скачивание файлов, исследую
                options.addArguments("--disable-popup-blocking");
                options.addArguments("--ignore-certificate-errors");
                options.addArguments("--disable-features=PromptForDownload");
                driver = new ChromeDriver(options);
            }
        } else {
            throw new IllegalStateException("Unsupported operating system: " + osName);
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // доверяю SSL внутри для DEV, для прода шаг не нужен
    public void trustAllCerts() {
        if (Objects.equals(documentationPage.baseUrl, "https://developers-portal-ui.baas-dev.alfaintra.net/")) {
            try {
                TrustManager[] trustAllCerts = new TrustManager[]{
                        new X509TrustManager() {
                            public X509Certificate[] getAcceptedIssuers() {
                                return null;
                            }

                            public void checkClientTrusted(X509Certificate[] certs, String authType) {
                            }

                            public void checkServerTrusted(X509Certificate[] certs, String authType) {
                            }
                        }
                };
                SSLContext sc = SSLContext.getInstance("TLS");
                sc.init(null, trustAllCerts, new java.security.SecureRandom());
                HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
                HostnameVerifier allHostsValid = new HostnameVerifier() {
                    public boolean verify(String hostname, SSLSession session) {
                        return true;
                    }
                };
                HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            try {
                driver.close();
            } finally {
                driver.quit();
            }
        }
    }

    //логика попутного скачивания файла при наличии файловых ссылок
    public void downloadFileByLink(@NotNull WebElement element, boolean activeDeleteDownloadFiles) {
        driver.get(element.getAttribute("href"));
        String link = element.getAttribute("href");
        String expectedFileName = link.substring(link.lastIndexOf("/") + 1);
        Instant startTime = Instant.now();
        Path filePath = Paths.get(downloadPath, expectedFileName);
        while (Duration.between(startTime, Instant.now()).getSeconds() < 60) {
            if (Files.exists(filePath)) {
                logger.fileLog(logger.FILE, expectedFileName, "успешно скачался браузером");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    logger.fileLog(logger.FILE, expectedFileName, "\033[31mне обнаружен в системе\033[0m");
                }
                if (activeDeleteDownloadFiles == true) {
                    try {
                        Files.delete(filePath);
                        logger.fileLog(logger.FILE, expectedFileName, "\033[31mуспешно удален\033[0m");
                    } catch (IOException e) {
                        logger.fileLog(logger.FILE, expectedFileName, "\033[31mошибка удаления файла\033[0m");
                    }
                }
                return;
            }
            try {
                Thread.sleep(1000); // Подождать 1 секунду перед следующей проверкой
            } catch (InterruptedException e) {
                logger.fileLog(logger.FILE, expectedFileName, "\033[31mне удалось скачать файл\033[0m");
            }
        }
        logger.fileLog(logger.FILE, expectedFileName, "\033[31mне удалось скачать файл за указанное время ожидания\033[0m");
    }

    //проверка AlfaAPI, где открывается все статью раздела
    public void checkAlfaAPISection() {
        driver.get(documentationPage.baseUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated((documentationPage.detailsAlfaAPI))).click();
        wait.until(ExpectedConditions.urlToBe(documentationPage.alfaApiSectionUrl));
        wait.until(ExpectedConditions.visibilityOfElementLocated((documentationPage.allSection))).click();
        wait.until(ExpectedConditions.urlToBe(documentationPage.specificationIntroUrl));
    }

    //проверка AlfaPay, где открывается все статью раздела
    public void checkAlfaPaySection() {
        driver.get(documentationPage.baseUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated((documentationPage.detailsAlfaPay))).click();
        wait.until(ExpectedConditions.urlToBe(documentationPage.alfaPaySectionUrl));
        wait.until(ExpectedConditions.visibilityOfElementLocated((documentationPage.allSection))).click();
        wait.until(ExpectedConditions.urlToBe(documentationPage.paymentsCreateUrl));
    }

    //раздел FAQ и проверка аккордеонов с ответами
    public void openFAQAndAllAnswers() {
        driver.get(basePage.baseUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated(landingPage.moreButtonLocator));
        Assertions.assertEquals(documentationPage.baseUrl, driver.getCurrentUrl());
        driver.findElement(faqPage.faqTab).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(faqPage.questionAccordion));
        Assertions.assertEquals(faqPage.faqUrl, driver.getCurrentUrl());
        List<WebElement> questions = driver.findElements(faqPage.questionAccordion);
        if (questions.size() == 29) {
            for (int i = 0; i < questions.size(); i++) {
                WebElement accordion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='accordion__header'])" + "[" + (i + 1) + "]")));
                ((JavascriptExecutor) driver).executeScript(
                        "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);" +
                                "var elementTop = arguments[0].getBoundingClientRect().top;" +
                                "window.scrollBy(0, elementTop-(viewPortHeight/2));", accordion);
                accordion.click();
                wait.until(ExpectedConditions.visibilityOfElementLocated(faqPage.answerText));
            }
        } else {
            logger.toDo(logger.WARNING, "Нужно проверить изменения в DOM");
        }
    }

    //логика обработки страниц и попутного скачивания файла при наличии файловых ссылок
    public void checkOpenAllPagesByURLsAndDownloadFiles(boolean activeDeleteDownloadFiles) {
        for (int i = 0; i < documentationPage.docPointsUrls.length; i++) {
            trustAllCerts();
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(documentationPage.docPointsUrls[i]).openConnection();
                connection.setRequestMethod("GET");
                connection.connect();
                int responseCode = connection.getResponseCode();
                connection.disconnect();
                if (responseCode == 200) {
                    logger.log(logger.SUCCESS, "Страница открывается", documentationPage.docPointsUrls[i], "Код: " + responseCode);
                    driver.get(documentationPage.docPointsUrls[i]);
                    wait.until(ExpectedConditions.visibilityOfElementLocated(documentationPage.headerLocator));
                    try {
                        List<WebElement> fileLinks = driver.findElements(documentationPage.fileLink);
                        for (WebElement fileLink : fileLinks) {
                            downloadFileByLink(fileLink, activeDeleteDownloadFiles);
                        }
                    } catch (NoSuchElementException e) {
                        logger.fileLog(logger.WARNING, "ссылка для скачивания файла не обнаружена", "");
                    }
                } else if (responseCode == 308) {
                    String newLocation = connection.getHeaderField("Location");
                    logger.log(logger.WARNING, "Переадресация на", newLocation, "Код: " + responseCode);
                } else {
                    logger.log(logger.ERROR, "Страница не найдена", documentationPage.docPointsUrls[i], "Код: " + responseCode);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //Раздел releaseNotes и переход по всем внутренним ссылкам
    public void goToReleaseNotesPageAndCheckAllInnerLinks() {
        driver.get(documentationPage.baseUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated((basePage.releaseNotesTab))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated((releaseNotesPage.linksLocator)));
        List<WebElement> releaseNotes = driver.findElements(releaseNotesPage.linksLocator);
        for (WebElement releaseNote : releaseNotes) {
            try {
                String releaseLink = releaseNote.getAttribute("href");
                HttpURLConnection connection = (HttpURLConnection) new URL(releaseLink).openConnection();
                connection.setRequestMethod("GET");
                connection.connect();
                int responseCode = connection.getResponseCode();
                connection.disconnect();
                if (responseCode == 200) {
                    logger.log(logger.SUCCESS, "Страница открывается", releaseLink, "Код: " + responseCode);
                } else if (responseCode == 308) {
                    String newLocation = connection.getHeaderField("Location");
                    logger.log(logger.WARNING, "Переадресация на", newLocation, "Код: " + responseCode);
                } else {
                    logger.log(logger.ERROR, "Страница не найдена", releaseLink, "Код: " + responseCode);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //проверка секции AlfaID
    public void checkAlfaIDSection() {
        driver.get(documentationPage.baseUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated((documentationPage.detailsAlfaID))).click();
        wait.until(ExpectedConditions.urlToBe(documentationPage.alfaIDSectionUrl));
        wait.until(ExpectedConditions.visibilityOfElementLocated((documentationPage.allSection))).click();
        wait.until(ExpectedConditions.urlToBe(documentationPage.alfaIDIntroUrl));
    }

    //проверка главной страницы Dev Portal и продуктовых карточек
    public void openDevPortalMainPageAndCheckProductCards() {
        driver.get(basePage.baseUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated(landingPage.moreButtonLocator));
        Assertions.assertEquals(documentationPage.baseUrl, driver.getCurrentUrl());
        List<WebElement> productCards = driver.findElements(landingPage.productCardLocator);
        for (int i = 0; i < productCards.size(); i++) {
            WebElement productCard = driver.findElement(By.xpath("(//h3[@class='typography__component_1ve0s doc-item__title typography__styrene-small_rdy6f typography__medium_1ve0s typography__primary-inverted_1dy99'])" + "[" + (i + 1) + "]"));
            new Actions(driver)
                    .moveToElement(productCard)
                    .click()
                    .perform();
            wait.until(ExpectedConditions.visibilityOfElementLocated(documentationPage.headerLocator));
//            Assertions.assertEquals(documentationPage.redirectFirstProductCardUrls[i], driver.getCurrentUrl()); //убрал пока строгую проверку, т.к. на DEV redirect URL другой
            driver.navigate().back();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='typography__component_1ve0s doc-item__title typography__styrene-small_rdy6f typography__medium_1ve0s typography__primary-inverted_1dy99']")));
        }
    }

    //Логика переключения слайдером вправо и проверка открытия каждой страницы(пока по заголовку)
    public void openAllPointsByRightSlider() {
        driver.get(documentationPage.baseUrl);
        wait.until(ExpectedConditions.visibilityOfElementLocated(landingPage.moreButtonLocator));
        Assertions.assertEquals(documentationPage.baseUrl, driver.getCurrentUrl());
        driver.findElement(landingPage.productCardLocator).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(documentationPage.headerLocator));
        while (!Objects.equals(driver.getCurrentUrl(), documentationPage.outPaymentStatusUrl)) {
            WebElement slider = driver.findElement(documentationPage.contentNavigationRight);
            WebElement footer = driver.findElement(documentationPage.footer);
            new Actions(driver).scrollToElement(footer).perform();
            wait.until(ExpectedConditions.elementToBeClickable(footer));
            wait.until(ExpectedConditions.elementToBeClickable(slider));
            slider.click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(documentationPage.headerLocator));
        }
    }
}

