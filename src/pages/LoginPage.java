package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AHeadComponent {
    @FindBy(css = "#login-form > section > div:nth-child(2) " +
            "> div.col-md-6 > input")
    private WebElement emailField;

    @FindBy(css = "#login-form > section > div:nth-child(3) " +
            "> div.col-md-6 > div > input")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"submit-login\"]")
    private WebElement signInButton;

    @FindBy(xpath = "//*[@class=\"btn\"]")
    private WebElement showButton;

    @FindBy(xpath = "//*[@class=\"btn\"]")
    private WebElement hideButton;

    @FindBy(css = "#login-form > section > div.forgot-password > a")
    private WebElement forgotPasswordButton;

    @FindBy(css = "#content > div > a")
    private WebElement createAccountButton;

    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // PageObject Atomic Operation

    // emailField
    public WebElement getEmailField() {
        return emailField;
    }

    public String getEmailFieldText() {
        return getEmailField().getText();
    }

    public void setEmailField(String text) {
        getEmailField().sendKeys(text);
    }

    public void clearEmailField() {
        getEmailField().clear();
    }

    public void clickEmailField() {
        getEmailField().click();
    }

    // passwordField
    public WebElement getPasswordField() {
        return passwordField;
    }

    public String getPasswordFieldText() {
        return getPasswordField().getText();
    }

    public void setPasswordField(String text) {
        getPasswordField().sendKeys(text);
    }

    public void clearPasswordField() {
        getPasswordField().clear();
    }

    public void clickPasswordField() {
        getPasswordField().click();
    }

    //Sign in button
    public WebElement getSignInButton() {
        return signInButton;
    }

    public void clickSignInButton() {
        getSignInButton().click();
    }

    //Show button
    public WebElement getShowButton() {
        return showButton;
    }

    public void clickShowButton() {
        getShowButton().click();
    }

    //Hide button
    public WebElement getHideButton() {
        return hideButton;
    }

    public void clickHideButton() {
        getHideButton().click();
    }

    //Forgot your password button
    public WebElement getForgotPasswordButton() {
        return forgotPasswordButton;
    }

    public void clickForgotPasswordButton() {
        getForgotPasswordButton().click();
    }

    //Create account button
    public WebElement getCreateAccountButton() {
        return createAccountButton;
    }

    public void clickCreateAccountButton() {
        getCreateAccountButton().click();
    }
}