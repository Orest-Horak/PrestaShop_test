import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestRunner {

    protected WebDriver driver;

    HomePage homePage = new HomePage(driver);

    @BeforeClass
    public WebDriver setUp() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod");
        driver.get("http://35.225.39.45/");
    }

    protected HomePage currencyChange() {
        // Steps
        homePage.clickCurrencyMenu();
        homePage.clickCurrencyEu();
        delayExecution(1000);
        homePage.clickCurrencyMenu();
        homePage.clickCurrencyUa();
        delayExecution(1000);
        homePage.clickCurrencyMenu();
        homePage.clickCurrencyUsd();
        return homePage;
    }

    protected HomePage changeCurrencyForOne() {
        delayExecution(1000);
        // Steps
        homePage.clicktShirt();
        homePage.clickCurrencyMenu();
        homePage.clickCurrencyUa();
        delayExecution(1000);
        return homePage;
    }
    protected Pages.HomePage currencyExchange(){


        return homePage;
    }

    protected void delayExecution(long miliseconds) {
        try {
            Thread.sleep((miliseconds));
        } catch (InterruptedException e) {

        }


    }
}
