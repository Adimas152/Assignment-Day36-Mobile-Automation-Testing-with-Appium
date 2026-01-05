package dibimbing.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage{
    public CartPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"Displays number of items in your cart\"]/android.widget.ImageView")
    private WebElement countCart;

    public boolean isCountCartPresent() {
        return countCart.isDisplayed();
    }
}
