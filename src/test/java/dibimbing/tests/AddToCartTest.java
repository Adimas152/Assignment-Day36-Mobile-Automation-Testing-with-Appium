package dibimbing.tests;

import dibimbing.core.BaseTest;
import dibimbing.core.DriverManager;
import dibimbing.pages.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {
    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    @Test
    public void addToCart(){
        GlobalPage globalPage = new GlobalPage(DriverManager.getDriver());
        LoginPage loginPage = new LoginPage(DriverManager.getDriver());
        ProductPage productPage = new ProductPage(DriverManager.getDriver());
        DetailProductPage detailProductPage = new DetailProductPage(DriverManager.getDriver());
        CartPage cartPage = new CartPage(DriverManager.getDriver());

        globalPage.clickViewMenu();
        globalPage.clickLoginMenuItem();
        loginPage.login("bod@example.com", "10203040");
        Assert.assertTrue(productPage.isTitlePresent());

        productPage.clickProductTitle();
        detailProductPage.clickBtnAddProductToCart();
        Assert.assertTrue(cartPage.isCountCartPresent());
    }
}
