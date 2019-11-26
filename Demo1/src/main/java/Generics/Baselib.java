package Generics;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import LoginPage.LoginFunc;

public class Baselib {
WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		//launch browser
	 ///navigate url
		//login functionaluty
		LoginFunc lg = new LoginFunc(driver);
		lg.login(driver);
	}
	
	@AfterMethod
	public void tear()
	{
		//logout
	}
	
	@AfterTest
	public void tear1()
	{
		driver.close();
	}
	
	
}
