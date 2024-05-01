package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjectModel.RegistrationPageObject;
import resources.baseClass;

public class VerifyRegistrationTestCases extends baseClass {
	
	
	
	
	@Test
	public void VerifyRegistrationWithValidData() throws IOException {
		driverInitilization();
        //this driver has scope we will pass the scope this driver to registration objecvt page drierv
		driver.get("https://naveenautomationlabs.com/opencart/");

		RegistrationPageObject rpo = new RegistrationPageObject(driver);//we pass the drievr in object to give scope to that driver

		rpo.clickOnMyAccount().click();
		rpo.clickOnRegister().click();
		rpo.Enterfirstname().sendKeys("abc");
		rpo.Enterlastname().sendKeys("test");
		rpo.Enteremail().sendKeys(Email);
		rpo.Entertelephone().sendKeys("9874563210");
		rpo.Enterpassword().sendKeys("secure");
		rpo.Enterpasswordconfirm().sendKeys("secure");
	
		rpo.clickOnpolicycheck().click();
		rpo.clickOnsubmit().click();
	}
}
