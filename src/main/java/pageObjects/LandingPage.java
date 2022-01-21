package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	private By signin = By.cssSelector("a[href*='sign_in']");	
	private By title = By.xpath("//h2[text()='Featured Courses']");
	private By navTab = By.cssSelector("ul[class*='nav navbar-nav navbar-right']");
	private By registerBtn = By.xpath("//span[text()='Register']");
	private By popup=By.xpath("//button[text()='NO THANKS']");

	public LoginPage getLogin() {
		// TODO Auto-generated method stub
		driver.findElement(signin).click();
		return new LoginPage(driver);
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public WebElement getNavTab() {
		// TODO Auto-generated method stub
		return driver.findElement(navTab );
	}

	public WebElement getRegisterBtn() {
		// TODO Auto-generated method stub
		return driver.findElement(registerBtn );
	}

	public int getPopUpSize()
	{
		return driver.findElements(popup).size();
	}
	public WebElement getPopUp()
	{
		return driver.findElement(popup);
	}

}
