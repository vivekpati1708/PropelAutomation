package propel.pageclasses.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CreateRootCatPage {
WebDriver driver;
WebDriverWait wait;
	
	public CreateRootCatPage(WebDriver driver)
	{
		this.driver=driver;
		//PageFactory.initElements(driver,this); 
		
		wait = new WebDriverWait(driver, 20);
	}
	
	@FindBy(id="MaintenanceCultureId")
	@CacheLookup
    WebElement ddBaseCulture;
	
	@FindBy(id="UniqueName")
	@CacheLookup
    WebElement tbUniqueName;
	
	@FindBy(id="CategoryName")
	@CacheLookup
    WebElement tbDisplayName;
	
	@FindBy(id="ShortDescription")
	@CacheLookup
    WebElement tbShortDescription;
	
	@FindBy(id="LongDescription")
	@CacheLookup
    WebElement tbLongDescription;
	
	@FindBy(linkText="Next") 
	@CacheLookup
	WebElement linkNext;
	
	@FindBy(linkText="Finish") 
	@CacheLookup
	WebElement linkFinish;
	
	
	
	public void createRootCat()
	{
		//Selecting Base Culture
		wait.until(ExpectedConditions.visibilityOf(ddBaseCulture));
		Select objBaseCulture = new Select(ddBaseCulture);
		objBaseCulture.selectByVisibleText("English (United States)");
		
		// Enter Unique Name
		wait.until(ExpectedConditions.visibilityOf(tbUniqueName));
		tbUniqueName.sendKeys("AutoRootCat");
		// Enter Display Name
		wait.until(ExpectedConditions.visibilityOf(tbDisplayName));
		tbDisplayName.sendKeys("AutoRootCat");
		// Enter short Description
		wait.until(ExpectedConditions.visibilityOf(tbShortDescription));
		tbShortDescription.sendKeys("AutoRootCat");
		//Enter Long Description
		wait.until(ExpectedConditions.visibilityOf(tbLongDescription));
		tbLongDescription.sendKeys("AutoRootCat");
		
		//Click on Next Button
		//wait.until(ExpectedConditions.visibilityOf(linkNext));
		linkNext.click();
		
	}
}
