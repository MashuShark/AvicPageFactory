package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPopup extends BasePage {

    @FindBy(xpath = "//div[@id='js_cart']")
    private WebElement popupCart;

    @FindBy(xpath = "//div[@class='btns-cart-holder']//a[contains(@class,'btn--orange')]")
    private WebElement continueShopping;

    @FindBy(xpath = "//div[@class='cart-parent-limit']//i[@class='icon icon-close js-btn-close']")
    private WebElement removeProductButton;

    @FindBy(xpath = "//button[@type='button'][@title='Close']")
    private WebElement cartCloseButton;

    public CartPopup(WebDriver driver) {
        super(driver);
    }

    public void waitPopupCart(){
        waitVisibilityOfElement(60, popupCart);
    }

    public void clickContinueShopping(){
        continueShopping.click();
    }

    public void clickRemoveProductButton(){
        removeProductButton.click();
    }

    public void clickCartCloseButton(){
        cartCloseButton.click();
    }
}
