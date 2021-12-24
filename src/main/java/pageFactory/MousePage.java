package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MousePage extends BasePage {

    @FindBy(xpath = "//div[@class='filter-wrapp']/div[@class='filter__items checkbox']/a[text()='Показать все'][1]")
    private WebElement seeAllByVendorButton;

    @FindBy(xpath = "//div[@class='filter-area js_filter_parent']//a[contains(@href, razer)][text()='Razer']")
    private WebElement razerVendor;

    @FindBy(xpath = "//div[@class='prod-cart__descr']")
    private List<WebElement> listRazerMouse;

    @FindBy(xpath = "//div[@class='prod-cart height']//a[@class='prod-cart__buy'][1]")
    private WebElement addFirstProductOnPageToCartButton;

    public MousePage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void moveAndClickSeeAllByVendor(){
        Actions moveToSeeAllByVendorButton = new Actions(driver);
        moveToSeeAllByVendorButton.moveToElement(seeAllByVendorButton);
        moveToSeeAllByVendorButton.perform();
        seeAllByVendorButton.click();
    }

    public void moveAndClickRazerVendor(){
        Actions moveToRazerVendor = new Actions(driver);
        moveToRazerVendor.moveToElement(razerVendor);
        moveToRazerVendor.perform();
        razerVendor.click();
    }

    public List<WebElement> getListRazerMouse(){
        return listRazerMouse;
    }
    public void addFirstProductOnPageToCart(){
        addFirstProductOnPageToCartButton.click();
    }
}