package dibimbing.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {
    public ProductPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "title")
    private WebElement title;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sauce Labs Backpack']/preceding-sibling::android.widget.ImageView" )
    private WebElement productTitle;

    public boolean isTitlePresent() {
        return title.isDisplayed();
    }

    public void clickProductTitle() {
        productTitle.click();
    }

}