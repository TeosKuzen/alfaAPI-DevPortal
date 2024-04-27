package pages;

import org.openqa.selenium.By;
import tests.BaseTest;

public class BasePage extends BaseTest {
    public String baseUrl = "https://developers.alfabank.ru/"; //PROD
//    public String baseUrl = "https://developers-portal-ui.baas-dev.alfaintra.net/"; //DEV
    By documentationTab = By.xpath("//*[contains(text(), 'ДОКУМЕНТАЦИЯ')]");
    public By releaseNotesTab = By.xpath("//*[contains(text(),'RELEASE NOTES')]");
}
