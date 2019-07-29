package tests;

import org.testng.annotations.Test;
import pages.*;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class TestLoginForm extends TestRunner {
    @Test
    private void testSignIn() {
        HomePage page = new HomePage(driver);
        page.clickSignIn();

        LoginPage loginpage = new LoginPage(driver);
        loginpage.clickEmailField();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        loginpage.setEmailField("horak.orest@gmail.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        loginpage.setPasswordField("orgo98");

        loginpage.clickShowButton();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        loginpage.clickHideButton();

        loginpage.clickSignInButton();

        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        MyAccount accountpage = new MyAccount(driver);
        accountpage.clickSignOutButton();

    }

    @Test
    private void testChangePassword() {
        HomePage page = new HomePage(driver);
        page.clickSignIn();

        LoginPage loginpage = new LoginPage(driver);
        loginpage.clickEmailField();
        loginpage.setEmailField("horak.orest@gmail.com");
        loginpage.setPasswordField("orgo98");
        loginpage.clickSignInButton();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        MyAccount accountpage = new MyAccount(driver);
        accountpage.clickInformationButton();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        UserInformation userpage = new UserInformation(driver);
        userpage.setPassword("orgo98");
        userpage.setNewPassword("orgo98orgo98");
        userpage.clickShowButton();
        userpage.clickSaveButton();
    }
}
