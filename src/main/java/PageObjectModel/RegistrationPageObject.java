package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageObject {

	
	public WebDriver driver;//this driver is null  has no scope 
	// i will store locatores here
	private By myAccount = By.xpath("//a[@title='My Account']");
	private By Register = By.xpath("//a[text()='Register']");
	private By firstname = By.xpath("//input[@name='firstname']");
	private By lastname = By.xpath("//input[@name='lastname']");
	private By email = By.xpath("//input[@name='email']");
	private By telephone = By.xpath("//input[@name='telephone']");
	private By password = By.xpath("//input[@name='password']");
	private By passwordconfirm = By.xpath("//input[@name='confirm']");
	private By policycheck = By.xpath("//input[@type='checkbox']");
	private By submit = By.xpath("//input[@type='submit']");

	public RegistrationPageObject(WebDriver driver2) {
	
		this.driver=driver2;
	}

	public WebElement clickOnMyAccount() {

	    return driver.findElement(myAccount);
	}

	public WebElement clickOnRegister() {

	    return driver.findElement(Register);
	}
	public WebElement Enterfirstname() {

	    return driver.findElement(firstname);
	}
	public WebElement Enterlastname() {

	    return driver.findElement(lastname);
	}
	public WebElement Enteremail() {

	    return driver.findElement(email);
	}
	public WebElement Entertelephone() {

	    return driver.findElement(telephone);
	}
	public WebElement Enterpassword() {

	    return driver.findElement(password);
	}
	public WebElement Enterpasswordconfirm() {

	    return driver.findElement(passwordconfirm);
	}
	public WebElement clickOnpolicycheck() {

	    return driver.findElement(policycheck);
	}
	public WebElement clickOnsubmit() {

	    return driver.findElement(submit);
	}
	
}