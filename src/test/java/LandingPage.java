import org.openqa.selenium.By;

public class LandingPage extends BasePage {
    By moreButtonLocator = By.xpath("//*[contains(text(), 'Подробнее')]");
    By productCardLocator = By.xpath("//h3[@class='typography__component_1ve0s doc-item__title typography__styrene-small_rdy6f typography__medium_1ve0s typography__primary-inverted_1dy99']");
}
