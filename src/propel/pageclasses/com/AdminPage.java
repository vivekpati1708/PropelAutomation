package propel.pageclasses.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AdminPage {
WebDriver driver;
	
	public AdminPage(WebDriver driver)
	{
		this.driver=driver;
		//PageFactory.initElements(driver,this); 
	}
	
	@FindBy(linkText="Service Catalog Administration1") 
	@CacheLookup
	WebElement linkServiceCatalogAdministration;
	
	@FindBy(linkText="Support Catalog Administration") 
	@CacheLookup
	WebElement linkSupportCatalogAdministration;
	
	
	public void clickServiceCatalogAdmin()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("linkServiceCatalogAdministration")));
		wait.until(ExpectedConditions.visibilityOf(linkServiceCatalogAdministration));
		linkServiceCatalogAdministration.click();
	}
	
	public void clickSupportCatalogAdmin()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("linkServiceCatalogAdministration")));
		wait.until(ExpectedConditions.visibilityOf(linkServiceCatalogAdministration));
		linkSupportCatalogAdministration.click();
	}
}
