package tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestRunner {
    protected WebDriver driver;

    @BeforeClass
    public void Start() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get("http://35.225.39.45/index.php");
    }

    protected void delayExplicitExecution(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        /*wait.until(ExpectedConditions.elementToBeClickable(webElement));*/
    }

    protected void delayExecution(long miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

  /*  @AfterClass(alwaysRun = true)
    public void Exit() {
        driver.quit();
    }*/

}