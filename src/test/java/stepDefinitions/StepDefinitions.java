package stepDefinitions;

/*import org.openqa.selenium.By;*/
import Utilities.AppiumServer;
/*import io.appium.java_client.AppiumDriver;*/
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinitions {

	AppiumServer appiumServer = new AppiumServer();
	/* AppiumDriver<MobileElement> driver; */
	AndroidDriver<MobileElement> driver;

	@Before("@setup")
	public void setUp() throws Throwable {
		int port = 4723;
		try {
			if (!appiumServer.checkIfServerIsRunnning(port)) {
				System.out.println("Appium ready to use");
				appiumServer.startServer();
				appiumServer.stopServer();
			} else {
				System.out.println("Appium Server already running on Port - " + port);
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		driver = appiumServer.startServer();
	}

	@After("@destroy")
	public void tearDown() {
		driver.quit();
//		appiumServer.stopServer();
	}

	@Given("^I log into the app$")
	public void logIn() throws InterruptedException{
//			driver.findElementByXPath("//*[text(), 'Ask mom for help']").click();
//			Thread.sleep(10000);
//			driver.findElementByXPath("//*[text(), 'Example@address.com']").click();
//			driver.findElementByXPath("//*[text(), 'Example@address.com']").setValue("richad@nobi.com");

		/*driver.findElement(By.id("com.aa.android.qa:id/username")).setValue("5X78V88");*/
		/*driver.findElement(By.id("com.aa.android.qa:id/lastname")).setValue("Points");*/
		/*driver.findElement(By.id("com.aa.android.qa:id/password")).setValue("testing");*/
	}
}
