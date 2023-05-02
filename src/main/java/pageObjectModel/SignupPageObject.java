package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {
	public WebDriver driver;
	By Firstname=By.xpath("//input[@name='UserFirstName']");
	
	By Lastname=By.xpath("//input[@name='UserLastName']");
	
	By Email=By.xpath("//input[@name='UserEmail']");
	
	public WebElement enterFirstname() {
		return driver.findElement(Firstname);
	}
	
	public WebElement enterLastname() {
		return driver.findElement(Lastname);
	}
	
	public WebElement enterEmail() {
		return driver.findElement(Email);
	}

}
