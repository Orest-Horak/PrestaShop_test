package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AHeadComponent {


    protected WebDriver driver;


    @FindBy(css = "#_desktop_currency_selector > div > button ")
    private WebElement currencyMenu;

    @FindBy(xpath = "//*[@title=\"US Dollar\"]")
    private WebElement currencyUsd;

    @FindBy(xpath = "//*[@title=\"Ukrainian Hryvnia\"]")
    private WebElement currencyUa;

    @FindBy(xpath = "//*[@title=\"Euro\"]")
    private WebElement currencyEu;

    @FindBy(xpath = "//*[@alt=\"Hummingbird printed t-shirt\"]")
    private WebElement tShirt;

    @FindBy(xpath = "//*[@class='btn btn-primary add-to-cart']")
    private WebElement buttonAddToCart;

    @FindBy(id = "_desktop_cart")
    private WebElement cartButton;

    @FindBy(css = ".logo.img-responsive")
    private WebElement logo;

    @FindBy(xpath = "//*[@itemprop=\"price\"]")
    private WebElement productPrice;


    protected AHeadComponent(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //CurrencyMenu
    public WebElement getCurrencyMenu() {
        return currencyMenu;
    }

    public void clickCurrencyMenu() {
        getCurrencyMenu().click();
    }

    //CurrencyUsd
    public WebElement getCurrencyUsd() {
        return currencyUsd;
    }

    public void clickCurrencyUsd() {
        getCurrencyUsd().click();
    }

    public String getCurrencyTextUsd() {
        return getCurrencyUsd().getAttribute("title");
    }

    // CurrencyUa
    public WebElement getCurrencyUa() {
        return currencyUa;
    }

    public void clickCurrencyUa() {
        getCurrencyUa().click();
    }

    public String getCurrencyTextUa() {
        return getCurrencyUa().getAttribute("title");
    }

    // CurrencyEu
    public WebElement getCurrencyEu() {
        return currencyEu;
    }

    public void clickCurrencyEu() {
        getCurrencyEu().click();
    }

    public String getCurrencyTextEu() {
        return getCurrencyEu().getAttribute("title");
    }

    //CartButton
    public WebElement getCartButton() {
        return cartButton;
    }

    public String getCartButtonText() {
        return getCartButton().getText();
    }


    //Logo
    public WebElement getLogo() {
        return logo;
    }

    public String getLogoText() {
        return getLogo().getText();
    }

    public void clickLogo() {
        getLogo().click();
    }

    //Product

    public WebElement gettShirt() {
        return tShirt;
    }


    public void clicktShirt() {
        gettShirt().click();
    }

    public WebElement getProductPrice() {
        return productPrice;
    }

    public String getProductPriceText() {
        return getProductPrice().getAttribute("content");
    }

    public WebElement getButtonAddToCart() {
        return buttonAddToCart;
    }

    public void clickButtonAddToCart() {
        getButtonAddToCart().click();
    }


}
