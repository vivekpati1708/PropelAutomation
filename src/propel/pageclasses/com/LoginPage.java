package propel.pageclasses.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import propel.utility.com.GenericUtility;

public class LoginPage {
  
	WebDriver driver;
	
	 public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		//PageFactory.initElements(driver,this); 
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
	
	@FindBy(name="s")
	@CacheLookup
	WebElement tbSerachbox;
	
	@FindBy(id="log1")
	@CacheLookup
	WebElement tbUserID;
	
	@FindBy(id="pwd")
	@CacheLookup
	WebElement tbPassword1;
	
	
	public void enterLoginInfo()
	{
		tbusername.sendKeys("vivek.pati@hpe.com");
		tbpassword.sendKeys("anyone");
		btnLogin.click();
		
	}
	
	public void EnterSearch()
	{
		tbSerachbox.sendKeys("Mouse");
		//tbSerachbox.submit();
		
	}
	
	public void logindemo()
	{
		
		tbUserID.sendKeys("muralimaraka");
		tbPassword1.sendKeys("nasa");
	}
	
	
	

		
}
