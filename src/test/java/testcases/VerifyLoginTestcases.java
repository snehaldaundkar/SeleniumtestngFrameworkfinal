package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LogInPageObject;
import resources.baseClass;


public class VerifyLoginTestcases extends baseClass {

	
	@Test
	public void VerifyLogInWithValidData() throws IOException {
		driverInitilization();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		LogInPageObject lpo=new LogInPageObject(driver);
		
		lpo.enterEmail().sendKeys(Email);
		lpo.enterPassword().sendKeys("secure");
		lpo.clickOnLoginButton().click();
	}
}
