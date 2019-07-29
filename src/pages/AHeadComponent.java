package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AHeadComponent {
    private final String LOGIN_ERROR = "Login Error";

    protected WebDriver driver;
    @FindBy(css = "#_desktop_user_info > div > a > span")
    private WebElement signIn;

    protected AHeadComponent(WebDriver driver) {
        this.driver = driver;
        //signIn = driver.findElement(By.cssSelector("#_desktop_user_info > div"));
        PageFactory.initElements(driver, this);
        // PageObject Atomic Operation
    }

    //Sign in
    public WebElement getSignIn() {
        return signIn;
    }

    public String getSignInText() {
        return getSignIn().getText();
    }

    public void clickSignIn() {
        getSignIn().click();
    }

}
