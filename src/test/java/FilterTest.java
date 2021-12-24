import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FilterTest extends BaseTest{

    @Test
    public void checkThatFilterResultsContainsSearchWord(){
        getHomePage().waitAndClosePopup();
        getHomePage().clickOnComputersButton();
        getHomePage().clickOnComputersButton();
        getComputersPage().clickOnMouseButton();
        getMousePage().moveAndClickSeeAllByVendor();
        getMousePage().moveAndClickRazerVendor();
        getMousePage().waitLoadPage(60);
        for (WebElement element : getMousePage().getListRazerMouse()) {
            assertTrue(element.getText().contains("Razer"));
        }
    }

    @Test
    public void checkThatResultOfFilterSortingAscendingPrice(){
        getHomePage().waitAndClosePopup();
        getHomePage().clickOnPhonesButton();
        getPhonesPage().clickOnSmartphonesButton();
        getPhonesPage().implicitWait(30);
        getHeaderOfPages().clickDropDownSelector();
        getPhonesPage().implicitWait(2);
        getHeaderOfPages().selectCheapToExpensive();

        for(int i = 0; i < getSmartphonesPage().getSizeOfSmartphonesListByCheapToExpensive()-1; i++) {
            int currentPrice = Integer.valueOf(getSmartphonesPage().getSmartphonesListByCheapToExpensive().get(i).getText().split(" ")[0]);
            int nextPrice = Integer.valueOf(getSmartphonesPage().getSmartphonesListByCheapToExpensive().get(i+1).getText().split(" ")[0]);
            assertTrue(currentPrice <= nextPrice, "List is not ascending:"+getSmartphonesPage().getSmartphonesListByCheapToExpensive()
                    .get(i).getText().split(" ")[0]+">"+getSmartphonesPage().getSmartphonesListByCheapToExpensive()
                    .get(i+1).getText().split(" ")[0]);
        }
    }

}
