package pages;

import org.openqa.selenium.By;

public class FAQPage extends BasePage {

    public By faqTab = By.xpath("//*[contains(text(),'FAQ')]");
    public By questionAccordion = By.xpath("//button[@class='accordion__header']");
    public By answerText = By.xpath("//span[@class='faq__answer typography__primary-small_1fmfd']");
    public String faqUrl = baseUrl + "faq";

}
