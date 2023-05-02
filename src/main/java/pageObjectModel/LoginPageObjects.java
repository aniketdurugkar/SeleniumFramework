package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;
	
	By username=By.xpath("//input[@id='username']");
	
	By password=By.xpath("//input[@id='password']");
	
	By login=By.xpath("//input[@id='Login']");
	
	public WebElement enterusername() {
			return driver.findElement(username);
	}
	
	public WebElement enteruserpassword() {
		return driver.findElement(password);
	}
	
	public WebElement clickLogin() {
		return driver.findElement(login);
	}

}
