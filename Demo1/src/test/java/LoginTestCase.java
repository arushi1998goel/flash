import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Dashboard.Dashboard;
import Generics.Baselib;

public class LoginTestCase extends Baselib {

	
	@Test
	public void verifylogin(WebDriver driver)
	{
		Dashboard db = new Dashboard(driver);
		db.verifylogin();
		
	}
	
	@Test
	public void updateprofile(WebDriver driver)
	{
		//update profile
		
	}
	
}
