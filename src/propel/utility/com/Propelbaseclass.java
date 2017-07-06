package propel.utility.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/*Base class to include or initial methods.
 */
public class Propelbaseclass 
{
	public static WebDriver driver;
			
	@BeforeClass
	public void startBrowser()
	{
		Reporter.log("Browser Sesstion Stated Successfully");
		switch (Constant.BROWSER.toUpperCase().trim()) 
		{
		case "FIREFOX":
			driver=new FirefoxDriver();
			break;
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\maraka\\git\\PropelAutomation\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;	
		case "IE":
			System.setProperty("webdriver.ie.driver","C:\\Users\\maraka\\git\\PropelAutomation\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;	
		default:
			break;
		}
		//driver.manage().window().maximize();
		driver.get(Constant.URL);	
	}	
	// Call this method to quit browser. 
	
	@AfterClass
	public void quitBrowser()
	{
		Reporter.log("Browser Sesstion closed successfully");	
		driver.quit();;
	}
	
	@AfterMethod()
	void takeScreenshot()
	{
		Reporter.log("Screenshot captured for testcase");
		GenericUtility.captureScreenshot(driver,"name of screenshot");
	}
	
	
		
	}
	

