package Helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class BrowserOperation
{

	WebDriver driver;
	public WebDriver launchApplication(String browserName) throws Exception
	{
		switch(browserName)
		{
		case "Firefox":
			System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
		 	driver = new FirefoxDriver();
		 	
			break;
			
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case "IE":
			System.setProperty("webdriver.ie.driver", "c:\\IEDriverServerdriver.exe");
			driver= new InternetExplorerDriver();
			break;
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com");
		return driver;
	
	
		
	}
}
