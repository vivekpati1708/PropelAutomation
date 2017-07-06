package prople.utility.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
/*Base class to include or initial methods.
 * vivek as champ 
 * */
public class Propelbaseclass 
{
	WebDriver driver;
  
	public void startBrowser(String browserName,String url)
	
	{
		switch (browserName.toUpperCase().trim()) 
		{
		case "FIREFOX":
			driver=new FirefoxDriver();
			break;
		case "CHROME":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\maraka\\workspace\\PropelAutomation\\Data\\Driverschromedriver.exe");
			driver = new ChromeDriver();
			break;	
		case "IE":
			System.setProperty("webdriver.ie.driver","C:\\Users\\maraka\\workspace\\PropelAutomation\\Data\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;	
		default:
			break;
		}
	}	
	// Call this method to quit browser. 	
	void quitBrowser(){
		
	}
	
		
	}
	

