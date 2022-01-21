package HomeAutomation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import utility.Base;


public class HomePageTC extends Base{
	
	private static Logger log = LogManager.getLogger(LoginTC.class.getName());
	public WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver = intializeBrowser();
		log.info("driver is initialised");		
	}
	
	@Test
	public void openUrl() throws IOException {
		
		driver.get(prop.getProperty("url"));	
		log.info("navigated to home page");
		LandingPage lp = new LandingPage(driver);
		Assert.assertEquals(lp.getTitle().getText(),"FEATURED COURSESS");
		log.info("Featurd courses text is validated");
	
	}
	
	
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	

}
