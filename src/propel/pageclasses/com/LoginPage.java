package propel.pageclasses.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage {
  
	WebDriver driver;
	
	LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(id="Name") 
	@CacheLookup
	WebElement tbusername;
	
	@FindBy(id="PasswordValue") 
	@CacheLookup
	WebElement tbpassword;
	
	@FindBy(id="submit")
	@CacheLookup
	WebElement btnLogin;
	
	public void enterLoginInfo()
	{
		tbusername.sendKeys("vivek.pati@dxc.com");
		tbpassword.sendKeys("anyone");
		btnLogin.click();
		
	}
	

		
}
