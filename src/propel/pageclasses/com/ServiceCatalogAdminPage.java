package propel.pageclasses.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ServiceCatalogAdminPage {
WebDriver driver;
	
	public ServiceCatalogAdminPage(WebDriver driver)
	{
		this.driver=driver;
		//PageFactory.initElements(driver,this); 
	}
	
	@FindBy(id="create_root_category") 
	@CacheLookup
	WebElement spanCreateRootCat;
	
	
	public void clickRootCat()
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("linkServiceCatalogAdministration")));
		wait.until(ExpectedConditions.visibilityOf(spanCreateRootCat));
		spanCreateRootCat.click();
	}
}
