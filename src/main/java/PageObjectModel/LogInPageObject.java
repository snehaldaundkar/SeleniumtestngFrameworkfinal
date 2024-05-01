package PageObjectModel;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageObject {

	public WebDriver driver;  // This dirver is null--this dont have any scope 

	// we will store locators here --

	// driver.fidElemet(By.xpath"").click();

	private By email = By.xpath("//input[@name='email']");
	private By password = By.xpath("//input[@name='password']");
	private By loginButton = By.xpath("//input[@type='submit']");
	
	
	
	public LogInPageObject(WebDriver driver2) {
		
		this.driver=driver2;
	}

	public WebElement enterEmail() {
		return driver.findElement(email);
	}

	public WebElement enterPassword() {
		return driver.findElement(password);
	}

	public WebElement clickOnLoginButton() {
		return driver.findElement(loginButton);
	}

	
}