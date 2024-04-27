import org.openqa.selenium.By;

public class BasePage extends BaseTest {
    //    String baseUrl = "https://developers.alfabank.ru/"; //PROD
    String baseUrl = "https://developers-portal-ui.baas-dev.alfaintra.net/"; //DEV-стенд
    By documentationTab = By.xpath("//*[contains(text(), 'ДОКУМЕНТАЦИЯ')]");
    By releaseNotesTab = By.xpath("//*[contains(text(),'RELEASE NOTES')]");
}
