package dibimbing.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DetailProductPage extends BasePage{
    public DetailProductPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "Tap to add product to cart")
    private WebElement btnAddProductToCart;

    public void clickBtnAddProductToCart() {
        btnAddProductToCart.click();
    }
}
