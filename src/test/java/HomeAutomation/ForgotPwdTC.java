package HomeAutomation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pageObjects.ForgotPage;
import utility.Base;

public class ForgotPwdTC extends Base {

	public WebDriver driver;
	private static Logger log = LogManager.getLogger(LoginTC.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = intializeBrowser();
		log.info("driver is initialised");
	}

	@Test
	public void signIn(String userName, String pwd) throws IOException {
		driver.get(prop.getProperty("url"));
		log.info("navigated to home page");
		ForgotPage fp = new ForgotPage(driver);

		fp.getEmail().sendKeys("test@email.com");
		fp.getMeInsBtn().click();
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
