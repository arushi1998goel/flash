package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginFunc {

	@FindBy(id="Abc")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement Password;
	
	@FindBy(xpath="Abc")
	private WebElement SAubmitbtn;
	
	public LoginFunc(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void login(WebDriver driver)
	{
		username.sendKeys("ABC");
		Password.sendKeys("password");
		Reporter.log("Click on submit btn");
		SAubmitbtn.click();		
	}
}
