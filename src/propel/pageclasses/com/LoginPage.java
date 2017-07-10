package propel.pageclasses.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	
	@FindBy(xpath=".//a[@class='jqTransformSelectOpen']")
	@CacheLookup
	WebElement openTenantList;
	
	@FindBy(xpath=".//li/a[contains(text(),'HP-Test')]")
	@CacheLookup
	WebElement selectTenant;
	
	@FindBy(xpath=".//*[@id='button']")
	@CacheLookup
	WebElement enter;
	 
	public void enterLoginInfo()
	{
		tbusername.sendKeys("vivek.pati@hpe.com");
		tbpassword.sendKeys("anyone");
		btnLogin.click();
	}
	
	public void selectTenant()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SelectedTenantName")));	
		openTenantList.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//li/a[contains(text(),'HP-Test')]")));
		selectTenant.click();
		enter.click();
	}
			
}
