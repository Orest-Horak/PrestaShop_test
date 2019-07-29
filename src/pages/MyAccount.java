package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount extends LoginPage {
    @FindBy(xpath = "//*[@id=\"identity-link\"]")
    private WebElement informationButton;

    @FindBy(xpath = "//*[@id=\"address-link\"]")
    private WebElement addFirstAdressButton;

    @FindBy(xpath = "//*[@id=\"history-link\"]")
    private WebElement orderHistoryButton;

    @FindBy(xpath = "//*[@id=\"order-slips-link\"")
    private WebElement creditSlipsButton;

    @FindBy(css = "#main > footer > div > a")
    private WebElement signOutButton;

    public MyAccount(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //Get first Address button
    public WebElement getAddFirstAddressButton() {
        return addFirstAdressButton;
    }

    public void clickAddFirstAdressButton() {
        getAddFirstAddressButton().click();
    }

    //Order history and details button
    public WebElement getOrderHistoryButton() {
        return orderHistoryButton;
    }

    public void clickOrderHistoryButton() {
        getOrderHistoryButton().click();
    }

    //Credit slips button
    public WebElement getCreditSlipsButton() {
        return creditSlipsButton;
    }

    public void clickCreditSlipsButton() {
        getCreditSlipsButton().click();
    }

    //Information button
    public WebElement getInformationButton() {
        return informationButton;
    }

    public void clickInformationButton() {
        getInformationButton().click();
    }

    //Sign out button
    public WebElement getSignOutButton() {
        return informationButton;
    }

    public void clickSignOutButton() {
        getSignOutButton().click();
    }
}
