package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderOfPages extends BasePage {

    @FindBy(xpath = "//span[@class='sidebar-item']")
    private WebElement productCatalogButton;

    @FindBy(xpath = "//div[@class='header-bottom__cart active-cart flex-wrap middle-xs js-btn-open']")
    private WebElement cartButton;

    @FindBy(xpath = "//div[@class='category-top']//span[@class='select2 select2-container select2-container--sort select2-container--default']//span[@class='select2-selection select2-selection--single']")
    private WebElement dropDownSelector;

    @FindBy(xpath = "//li[text()='От дешевых к дорогим']")
    private WebElement cheapToExpensiveSelector;

    public HeaderOfPages(WebDriver driver) {
        super(driver);
    }

    public void clickOnProductCatalogButton(){
        productCatalogButton.click();
    }

    public void waitAndClickOnCartButton(){
        waitVisibilityOfElement(60, cartButton);
        cartButton.click();
    }

    public void clickDropDownSelector(){
        dropDownSelector.click();
    }

    public void selectCheapToExpensive(){
        cheapToExpensiveSelector.click();
    }
}
