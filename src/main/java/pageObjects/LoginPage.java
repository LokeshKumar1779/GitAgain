package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Base;

public class LoginPage extends Base {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	private By loginField = By.cssSelector("input[id='email']");
	private By pwdField = By.cssSelector("input[id='password']");
	private By loginBtn = By.cssSelector("input[value='Login']");
	private By forgotBtn = By.cssSelector("a[href*='password']");

	public WebElement getUserName() {
		return driver.findElement(loginField);
	}

	public WebElement getPwd() {
		// TODO Auto-generated method stub
		return driver.findElement(pwdField);
	}

	public WebElement getLoginBtn() {
		// TODO Auto-generated method stub
		return driver.findElement(loginBtn);
	}

	public ForgotPage getForgotPwd() {
		// TODO Auto-generated method stub
		driver.findElement(forgotBtn).click();
		return new ForgotPage(driver);
	}

}
