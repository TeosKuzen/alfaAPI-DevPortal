import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DevPortalUITests extends BaseTest {

    @Test
    @DisplayName("Регресс DEV Portal")
    public void openDevPortalAndCheckAllPages() {
        openDevPortalMainPageAndCheckProductCards();
        openAllPointsByRightSlider();
        openFAQAndAllAnswers();
        checkOpenAllPagesByURLsAndDownloadFiles(true);
        checkAlfaAPISection();
        checkAlfaIDSection();
        checkAlfaPaySection();
        goToReleaseNotesPageAndCheckAllInnerLinks();
    }

    @Test
    @DisplayName("Для изолированных проверок")
    public void checkTestMethod () {
        openAllPointsByRightSlider();
    }
}

