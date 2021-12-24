import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CartTest extends BaseTest{

    @FindBy(xpath = "//div[contains(@class,'header-bottom__cart')]//div[contains(@class,'cart_count')]")
    private WebElement actualProductsCountInCart;

    @Test
    public void checkEmptyingCart(){
        getHomePage().waitAndClosePopup();
        getHeaderOfPages().clickOnProductCatalogButton();
        getHomePage().clickOnComputersButton();
        getComputersPage().clickOnMouseButton();
        getMousePage().addFirstProductOnPageToCart();
        getCartPopup().waitPopupCart();
        getCartPopup().clickContinueShopping();
        getHeaderOfPages().waitAndClickOnCartButton();
        getCartPopup().clickRemoveProductButton();
        getMousePage().waitLoadPage(30);
        assertEquals(actualProductsCountInCart, null);
    }
}
