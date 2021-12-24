import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class NavigateTest extends BaseTest {

    private final String EXPECTED_TITLE_MOUSE = "Мыши - ⚡Купить компьютерную мышь⚡ по низкой цене в Киеве, Харькове с доставкой по всей Украине : Avic";

    @Test
    public void checkPageIsNavigatedWithExpectedTitle(){
        getHomePage().waitAndClosePopup();
        getHomePage().clickOnComputersButton();
        getHomePage().clickOnComputersButton();
        getComputersPage().clickOnMouseButton();
        assertEquals(getMousePage().getTitle(), EXPECTED_TITLE_MOUSE);
    }
}
