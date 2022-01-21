package HomeAutomation;
import utility.Base;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

public class LandingPageTC extends Base{
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(LandingPageTC.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver = intializeBrowser();
		log.info("driver is initialised");
		driver.get(prop.getProperty("url"));
		log.info("navigated to home page");
		
	}

	@Test
	public void clickLogin() throws IOException {
		
		
		LandingPage lp = new LandingPage(driver);
		Assert.assertTrue(lp.getNavTab().isDisplayed());
		log.info("Navigation tab is displayed");
		Assert.assertTrue(lp.getRegisterBtn().isDisplayed(), "Register button is displayed");
		log.info("Register button is displayed");
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	
}
