package Dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Dashboard {

	@FindBy(xpath="//div[text()='Successmsg']")
	private WebElement successmsg;
	
	public Dashboard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifylogin()
	{
		boolean flag = successmsg.isDisplayed();
		Assert.assertTrue(flag, "Login func is not verified");
		Reporter.log("Verified login func!!");
		
	}
}
