package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjectModel.LoginPageObjects;
import resources.baseclass;

public class VerifyLogin extends baseclass{
	@Test
	public void login() throws IOException {
		
		initializerDriver();
		driver.get("https://login.salesforce.com/");
		
		LoginPageObjects LPO = new LoginPageObjects();
		
		LPO.enterusername().sendKeys("Aniket");
		LPO.enteruserpassword().sendKeys("1234");
		LPO.clickLogin().click();
	}

}
