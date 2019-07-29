package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInformation extends MyAccount {
    @FindBy(css = "#customer-form > section >" +
            " div:nth-child(6) > div.col-md-6 > div > input")
    private WebElement password;

    @FindBy(css = "#customer-form > section >" +
            " div:nth-child(7) > div.col-md-6 > div > input")
    private WebElement newPassword;

    @FindBy(css = "#customer-form > footer > button")
    private WebElement saveButton;

    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[6]/div[1]/div/span/button")
    private WebElement showButton;

    @FindBy(xpath = "//*[@id=\"customer-form\"]/section/div[6]/div[1]/div/span/button")
    private WebElement hideButton;

    public UserInformation(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // passwordField
    public WebElement getPassword() {
        return password;
    }

    public String getPasswordText() {
        return getPassword().getText();
    }

    public void setPassword(String text) {
        getPassword().sendKeys(text);
    }

    public void clearPassword() {
        getPassword().clear();
    }

    public void clickPassword() {
        getPassword().click();
    }

    //new password Field
    public WebElement getNewPassword() {
        return newPassword;
    }

    public String getNewPasswordText() {
        return getNewPassword().getText();
    }

    public void setNewPassword(String text) {
        getNewPassword().sendKeys(text);
    }

    public void clearNewPassword() {
        getNewPassword().clear();
    }

    public void clickNewPassword() {
        getNewPassword().click();
    }

    //Save button
    public WebElement getSaveButton() {
        return saveButton;
    }

    public void clickSaveButton() {
        getSaveButton().click();
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

}
