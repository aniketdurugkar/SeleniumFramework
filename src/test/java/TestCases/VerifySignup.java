package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import resources.baseclass;

public class VerifySignup extends baseclass  {
	
	@Test
	public void signup() throws IOException {
		initializerDriver();
		driver.get("https://login.salesforce.com/");
		
		
		
		
	}
}
