package stepDefinitions;

/*import org.openqa.selenium.By;*/
import utilities.AppiumServer;
/*import io.appium.java_client.AppiumDriver;*/
import utilities.Utility;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Login;

public class StepDefinitions {

	AppiumServer appiumServer = new AppiumServer();
	/* AppiumDriver<MobileElement> driver; */
	AndroidDriver<MobileElement> driver;

	private Utility utility;
	private Login login;

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
	public void logIn() {

	}


	@And("I click Get Started button")
	public void iClickGetStartedButton() throws Exception {
		Thread.sleep(80000);
//		login.waitUsingXpath(login.getStartedButton);
		login.getStartedButton.click();
	}

	@Then("I click continue with email button")
	public void iClickContinueWithEmailButton() {
		login.waitUsingXpath(login.continueWithEmailButton);
		login.continueWithEmailButton.click();
	}
	@And("I validate directed to email page")
	public void iValidateDirectedToEmailPage() {
		login.waitUsingXpath(login.fieldEmailAndPassword);
	}

	@Then("I click email field")
	public void iClickEmailField() {
		login.fieldEmailAndPassword.click();
	}

	@And("I want to filled the <email> field")
	public void iWantToFilledTheEmailField(String email) {
		login.fieldEmailAndPassword.sendKeys("qa-trade@usenobi.com");
	}

	@Then("I click continue button")
	public void iClickContinueButton() {
		login.waitUsingXpath(login.continueButton);
		login.continueButton.click();
	}

	@And("I want to filled the <password>field")
	public void iWantToFilledThePasswordField(String pass) {
		login.waitUsingXpath(login.fieldEmailAndPassword);
		login.fieldEmailAndPassword.click();
		login.fieldEmailAndPassword.sendKeys("Pass@word3");
	}

	@And("I enter my pin <pin>")
	public void iEnterMyPinPin(String pin) {
		login.waitUsingXpath(login.pinField);
		login.pinField.sendKeys("147258");
	}

	@Then("I successfully logged in")
	public void iSuccessfullyLoggedIn() {
		login.waitUsingXpath(login.marketHighlight);
		login.marketHighlight.isDisplayed();
	}

}
