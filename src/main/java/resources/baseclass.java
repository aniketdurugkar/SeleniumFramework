package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseclass {
	public WebDriver driver;
	public Properties prop;
	
	public void initializerDriver() throws IOException  {
		//this will access the file 
		FileInputStream fis= new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumTestNGproject\\src\\main\\java\\resources\\data.properties");
		
		//Read the file--
		prop=new Properties();
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) {
			 driver= new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("Firefox")) {
			 driver= new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("Edge")) {
			 driver= new EdgeDriver();
		}
		else {
			System.out.println("please choose valid browser to run your script");
		}
	}

	@BeforeMethod
	public void launchBrowzer() throws IOException {
		
		 initializerDriver() ;
		 String url=prop.getProperty("url");
		 driver.get(url);
	}
	
	@AfterMethod
	public void QuitBrowzer() throws IOException {
		
		 driver.quit();
	}
	
}
