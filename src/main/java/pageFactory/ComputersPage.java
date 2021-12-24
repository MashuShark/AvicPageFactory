package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersPage extends BasePage{

    @FindBy(xpath = "//div[@class='brand-box__info']//a[contains(@href, 'myishi')]")
    private WebElement mouseButton;

    public ComputersPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnMouseButton(){
        mouseButton.click();
    }
}
