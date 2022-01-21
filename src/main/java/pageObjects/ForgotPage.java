package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Base;

public class ForgotPage extends Base{
	
	WebDriver driver;
	private By emailBox = By.cssSelector("#user_email");
	private By sendMeBtn = By.cssSelector("input[value='Send Me Instruction']");
	
	public ForgotPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		
	}

	public WebElement getEmail() {
		// TODO Auto-generated method stub
		return driver.findElement(emailBox );
	}
	
	public WebElement getMeInsBtn() {
		return driver.findElement(sendMeBtn);
	}
	
	
}
