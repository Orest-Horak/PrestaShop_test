import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CurrencyTest extends TestRunner {


//    @DataProvider//(parallel = true)
//    public Object[][] currencyData() {
//        // Read from ...
//        return new Object[][]{
//                {Data.Currencies.EURO, "Euro"},
//                {Data.Currencies.UAH, "Ukrainian Hryvnia"},
//                {Data.Currencies.USD, "US DOLLAR"}
//                };
//    }

    @BeforeTest
    public void setup() {
        super.setUp();
        homePage = new HomePage(driver);
    }


    @Test//(dataProvider = "currencyData")
    public void checkCurrency() throws InterruptedException {
        HomePage homePage = currencyChange();
        // Check
        Assert.assertEquals(homePage.getCurrencyTextEu(), "Euro");
        Assert.assertEquals(homePage.getCurrencyTextUa(), "Ukrainian Hryvnia");
        Assert.assertEquals(homePage.getCurrencyTextUsd(), "US Dollar");
        delayExecution(2000);
    }

    @Test
    public void checkCurrencyForOneElement() throws InterruptedException {
        HomePage homePage = changeCurrencyForOne();
        // Check
        Assert.assertEquals(homePage.getProductPriceText(), "495.21");
        delayExecution(2000);
    }

    @Test
    public void currencyExchangeCheck() {
        HomePage homePage = currencyExchange();

        //Check
        //Assert.assertEquals();
    }


    protected void delayExecution(long miliseconds) {
        try {
            Thread.sleep((miliseconds));
        } catch (InterruptedException e) {

        }
    }

}

