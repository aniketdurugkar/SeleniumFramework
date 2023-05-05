package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.LoginPageObjects;
import pageObjectModel.SignupPageObjects;
import resources.baseclass;

public class VerifySignup extends baseclass  {
	
	 @Test
	 public void signup() throws IOException, InterruptedException {
	    
	  LoginPageObjects LPO=new LoginPageObjects(driver);
	  
	  LPO.ClickOnTryForFree().click();
	  
	  SignupPageObjects SPO=new SignupPageObjects(driver);
	  Thread.sleep(5000);
	  
	  SPO.firstname().sendKeys("hello");
	  SPO.lastname().sendKeys("helo");
	  SPO.jobtitle().sendKeys("IT Manager");
	  SPO.workemail().sendKeys("abc123@mail.com");
	  SPO.Company().sendKeys("Systems");
	  
	  
	  Select s=new Select(SPO.SelectEmployee());
	  s.selectByIndex(1);
	  
	 
	  
	 
	  
	  
	 }
	 
}
