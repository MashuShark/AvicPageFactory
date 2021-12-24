package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//li[@class='parent js_sidebar-item']/a[contains(@href, 'elektronika')]")
    private WebElement computersButton;

    @FindBy(xpath = "//div[@id='js_popUp']//img[@alt='Новогодние скидки']")
    private WebElement popup;

    @FindBy(xpath = "//div[@id='js_popUp']//button[@class='fancybox-button fancybox-close-small']")
    private WebElement closePopupButton;

    @FindBy(xpath = "//li[@class='parent js_sidebar-item']/a[contains(@href, 'telefonyi-i-aksessuaryi')]")
    private WebElement phonesButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnComputersButton(){
        computersButton.click();
    }

    public void waitAndClosePopup(){
        waitVisibilityOfElement(60, popup);
        closePopupButton.click();
    }

    public void clickOnPhonesButton(){
        phonesButton.click();
    }


}
