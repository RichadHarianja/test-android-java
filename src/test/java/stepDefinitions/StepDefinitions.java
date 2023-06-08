package stepDefinitions;

/*import org.openqa.selenium.By;*/
import utilities.AppiumServer;
/*import io.appium.java_client.AppiumDriver;*/
import utilities.Utility;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Login;

public class StepDefinitions {

	AppiumServer appiumServer = new AppiumServer();
	/* AppiumDriver<MobileElement> driver; */
	AndroidDriver<MobileElement> driver;

	private Utility utility;
	private Login loginPages;

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
		utility = new Utility(driver);
		loginPages = new Login(driver);
	}

	@After("@destroy")
	public void tearDown() {
		driver.quit();
//		appiumServer.stopServer();
	}

	@Given("^I log into the app$")
	public void logIn(){
	}

	@Then("^I want to filled the \"(.*)\" field$")
	public void filledEmailField(String email){
		loginPages.fieldEmail.sendKeys("email@gmail.com");
	}
}
