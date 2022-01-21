package HomeAutomation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import utility.Base;

public class LoginTC extends Base{
	
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(LoginTC.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver = intializeBrowser();
		log.info("driver is initialised");
	}
	@Test(dataProvider="data")
	public void signIn(String userName, String pwd) throws IOException, InterruptedException {
		driver.get(prop.getProperty("url"));
		log.info("navigated to home page");
		LandingPage lp = new LandingPage(driver);
		LoginPage loginp = lp.getLogin();
		log.info("login button clicked");		
		loginp.getUserName().sendKeys(userName);
		log.info("user name entered");
		loginp.getPwd().sendKeys(pwd);
		log.info("password entered");
		loginp.getLoginBtn().click();
		log.info("login button clicked");		
		
		Thread.sleep(2000);
		ForgotPage fp = loginp.getForgotPwd();
		fp.getEmail().sendKeys("test@email.com");
		fp.getMeInsBtn().click();
	}
	
	
	@DataProvider(name="data")
	public Object[][] getData() {
		Object[][] data = new Object [3][2];
		data[0][0] = "abcsdcc@qe.com";
		data[0][1] = "3243123";
		data[1][0] = "acsdcbc@qv.com";
		data[1][1] = "3243135123";
		data[2][0] = "absdfc@qw.com";
		data[2][1] = "32438786123";
		
		return data;
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	

}
