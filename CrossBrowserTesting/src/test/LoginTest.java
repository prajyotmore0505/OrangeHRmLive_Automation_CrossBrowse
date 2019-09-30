package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import Helpers.BrowserOperation;

public class LoginTest
{

	@Test
	@Parameters("browser")
	public void LoginTestMethod(String browsername) throws Exception
	{
		BrowserOperation browseroperationObj = new 	BrowserOperation();
		WebDriver driver=browseroperationObj.launchApplication(browsername);
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
}
