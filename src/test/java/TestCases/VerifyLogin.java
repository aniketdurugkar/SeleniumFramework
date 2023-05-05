package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.LoginPageObjects;
import resources.baseclass;

public class VerifyLogin extends baseclass{
	@Test
	 public void InvalidLogin() throws IOException {
	  
	  LoginPageObjects  LPO=new LoginPageObjects (driver);
	  
	  LPO.enterUsername().sendKeys("rahul");
	  LPO.enterPassword().sendKeys("123");
	  LPO.clickLogin().click();
	     
	  
	  String actualText=LPO.errorText().getText();
	  String expectedText="Please check your username. If you still can't log in, contact your Salesforce administrator.";
	  SoftAssert assertion=new SoftAssert();
	  assertion.assertEquals(actualText, expectedText, "Error message is not valid");
	  assertion.assertAll();
}

}