import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pageFactory.*;

import static io.github.bonigarcia.wdm.WebDriverManager.*;

public class BaseTest {
    private WebDriver driver;
    private static final String AVIC_URL = "https://avic.ua/";

    @BeforeTest
    public void profileSetUp() {
       chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(AVIC_URL);
    }
    @AfterMethod
    public void treadDown(){
        driver.close();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public HomePage getHomePage(){
        return new HomePage(getDriver());
    }

    public ComputersPage getComputersPage(){
        return new ComputersPage(getDriver());
    }

    public MousePage getMousePage(){
        return new MousePage(getDriver());
    }

    public CartPopup getCartPopup(){
        return new CartPopup(getDriver());
    }

    public HeaderOfPages getHeaderOfPages(){
        return new HeaderOfPages(getDriver());
    }

    public PhonesPage getPhonesPage() {return new PhonesPage(getDriver());}

    public SmartphonesPage getSmartphonesPage(){return new SmartphonesPage(getDriver());}
}
