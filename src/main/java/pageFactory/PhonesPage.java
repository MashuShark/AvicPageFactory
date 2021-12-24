package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhonesPage extends BasePage{

    @FindBy(xpath = "//div[@class='brand-box__title']//a[contains(@href,'smartfonyi')]")
    private WebElement smartphonesButton;

    public PhonesPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnSmartphonesButton(){
        smartphonesButton.click();
    }
}
