package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("deprecation")

public class Login {
    private AndroidDriver driver;

    public Login(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public WebElement waitUsingXpath(WebElement xpath) {
        return driver.findElementByXPath(String.valueOf(xpath));
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"idButtonUniversal\"]")
    public WebElement getStartedButton;


    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"idButtonUniversal\"])[2]")
    public WebElement continueWithEmailButton;


    @AndroidFindBy(xpath = "//android.widget.EditText")
    public WebElement fieldEmailAndPassword;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"idButtonUniversal\"]")
    public WebElement continueButton;

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]")
    public WebElement pinField;

    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")
    public WebElement marketHighlight;









}
