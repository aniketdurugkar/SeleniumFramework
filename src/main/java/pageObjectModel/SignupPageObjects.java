package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObjects {
	public WebDriver driver;

	By firstname = By.xpath("//input[@name='UserFirstName']");

	By lastname = By.xpath("//input[@name='UserLastName']");

	By workemail = By.xpath("//input[@name='UserEmail']");
	
	By Company= By.xpath("//input[@name='CompanyName']");

	By jobtitle = By.xpath("//input[@name='UserTitle']");

	By Employees = By.xpath("//select[@name='CompanyEmployees']");

	public SignupPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement firstname() {
		return driver.findElement(firstname);
	}

	public WebElement lastname() {
		return driver.findElement(lastname);
	}

	public WebElement workemail() {
		return driver.findElement(workemail);
	}

	public WebElement jobtitle() {
		return driver.findElement(jobtitle);
	}

	public WebElement SelectEmployee() {

		return driver.findElement(Employees);

	}

	public WebElement Company() {

		return driver.findElement(Company);

	}

}
