package propel.pageclasses.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage {
  
	WebDriver driver;
	
	 public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this); 
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
		tbusername.sendKeys("vivek.pati@hpe.com");
		tbpassword.sendKeys("anyone");
		btnLogin.click();
		
	}
	

		
}
