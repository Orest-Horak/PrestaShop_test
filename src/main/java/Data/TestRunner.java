package Data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestRunner {
    protected WebDriver driver;

    @BeforeClass
    public void beforClass(ITestContext context) {
        System.out.println("@beforeClass");
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //driver.get("http://my-prestashop");

    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        System.out.println("@AfterClass");
        //driver.quit();
    }

    @BeforeMethod
    public void beforeMethod() {
        //isTestSuccess = false;
        System.out.println("@BeforeMethod");
        driver.get("http://35.225.39.45");//http://p96645ca.beget.tech/  http://35.225.39.45
        //"http://my-prestashop"
    }

    protected void delayExecution(long miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
