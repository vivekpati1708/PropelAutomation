package propel.pageclasses.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DashboardPage {
WebDriver driver;
	
	public DashboardPage(WebDriver driver)
	{
		this.driver=driver;
		//PageFactory.initElements(driver,this); 
	}
	
	@FindBy(id="Service2") 
	@CacheLookup
	WebElement tabAdmin;
	
	
	public void clickAdmin()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(tabAdmin));	
		tabAdmin.click();
	}
}

