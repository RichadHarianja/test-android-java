package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
@SuppressWarnings("deprecation")
public class Login {
    private AndroidDriver driver;

    public Login(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /*example*/
    @AndroidFindBy(id = "com.lolo.io.onelist:id/title")
    public WebElement fieldEmail;

}
