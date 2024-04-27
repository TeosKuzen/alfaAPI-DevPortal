import org.openqa.selenium.By;

public class ReleaseNotesPage extends BasePage {
    String releaseNotesUrl = baseUrl + "release-notes";
    By linksLocator = By.xpath("//a[@class='link__component_mxfd9 link__defaultView_e18w7 link__withoutUnderline_mxfd9 md-link']");
}
