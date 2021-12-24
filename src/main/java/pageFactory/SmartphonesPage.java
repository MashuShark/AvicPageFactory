package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SmartphonesPage extends BasePage{

    @FindBy(xpath = "//div[@class='prod-cart__prise-new']")
    private List<WebElement> smartphonesListByCheapToExpensive;

    public SmartphonesPage(WebDriver driver) {
        super(driver);
    }

    public int getSizeOfSmartphonesListByCheapToExpensive() {
        return smartphonesListByCheapToExpensive.size();
    }

    public List<WebElement> getSmartphonesListByCheapToExpensive(){
        return smartphonesListByCheapToExpensive;
    }

}
