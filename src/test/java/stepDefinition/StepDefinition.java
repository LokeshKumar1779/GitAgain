package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.portalHomePage;
import utility.Base;

public class StepDefinition extends Base {

	private LoginPage loginp;

	@Given("^Initialize chrome browser$")
	public void initialize_chrome_browser() throws Throwable {
		driver = intializeBrowser();
	}

	@And("^Navigate to url \"([^\"]*)\"$")
	public void navigate_to_url(String strArg1) throws Throwable {
		driver.get(strArg1);

	}

	@And("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		LandingPage lp = new LandingPage(driver);
		if (lp.getPopUpSize() > 0) {
			lp.getPopUp().click();
		}
		loginp = lp.getLogin();
	}

	@When("^Enter userName (.+) and password (.+)$")
	public void enter_username_and_password(String username, String password) throws Throwable {
		loginp.getUserName().sendKeys(username);

		loginp.getPwd().sendKeys(password);

		loginp.getLoginBtn().click();
	}

	@Then("^Verify user is successfully logged in$")
	public void verify_user_is_successfully_logged_in() throws Throwable {
		portalHomePage p = new portalHomePage(driver);
		Thread.sleep(2000);
		Assert.assertTrue(p.getSearchBox().isDisplayed());
	}

	@And("^close browser$")
	public void close_browser() throws Throwable {
		driver.quit();
	}

}
