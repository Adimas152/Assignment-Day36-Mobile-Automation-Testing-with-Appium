package dibimbing.tests;

import dibimbing.core.BaseTest;
import dibimbing.core.DriverManager;
import dibimbing.pages.GlobalPage;
import dibimbing.pages.LoginPage;
import dibimbing.pages.ProductPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    @Test
    public void successLogin() {
        // Use for: go to login page entrypoint
        GlobalPage globalPage = new GlobalPage(DriverManager.getDriver());

        // Use for: input username, password and click login button
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());

        // Use for: assert login success
        ProductPage productPage = new ProductPage(DriverManager.getDriver());

        globalPage.clickViewMenu();
        globalPage.clickLoginMenuItem();

        // loginPage.inputUsername("bob@example.com");
        // loginPage.inputPassword("10203040");
        // loginPage.clickLoginButton();
        loginPage.login("bod@example.com", "10203040");

        Assert.assertTrue(productPage.isTitlePresent());
    }

    @Test
    public void failedLoginWithBlankInputUsernameAndPassword() {
        // Use for: go to login page entrypoint
        GlobalPage globalPage = new GlobalPage(DriverManager.getDriver());

        // Use for: input username, password and click login button
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());

        globalPage.clickViewMenu();
        globalPage.clickLoginMenuItem();

        loginPage.inputUsername("");
        loginPage.inputPassword("");
        loginPage.clickLoginButton();

        // Assert error message
        Assert.assertEquals(
                loginPage.getTextErrorUsername(),
                "Username is required"
        );
    }
}