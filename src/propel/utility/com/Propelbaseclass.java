package propel.utility.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
/*Base class to include or initial methods.
 */
public class Propelbaseclass 
{
	WebDriver driver;
  
	public WebDriver startBrowser(String browserName,String url)
	
	{
		switch (browserName.toUpperCase().trim()) 
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
		driver.get(url);
		
		return this.driver;
	}	
	// Call this method to quit browser. 	
	void quitBrowser(){
		
	}
	
		
	}
	

