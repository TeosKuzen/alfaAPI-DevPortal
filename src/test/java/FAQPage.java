import org.openqa.selenium.By;

public class FAQPage extends BasePage {

    By faqTab = By.xpath("//*[contains(text(),'FAQ')]");
    By questionAccordion = By.xpath("//button[@class='accordion__header']");
    By answerText = By.xpath("//span[@class='faq__answer typography__primary-small_1fmfd']");
    String faqUrl = baseUrl + "faq";

}
