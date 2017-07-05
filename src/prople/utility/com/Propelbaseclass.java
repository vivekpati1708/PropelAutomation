package prople.utility.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Propelbaseclass {
	WebDriver driver;
  
	public void startBrowser(String browserName,String url)
	
	{
		switch (browserName.toUpperCase().trim()) {
		case "FIREFOX":
			driver=new FirefoxDriver();
			break;
		case "CHROME":
			driver=new ChromeDriver();
			break;	
		case "IE":
			driver=new InternetExplorer();
			break;	
		default:
			break;
		}
		if (browserName.equalsIgnoreCase("Firefox")) {
			
			driver=new FirefoxDriver();
			
		}
		
		else if (browserName.equalsIgnoreCase("chromer")) 
		{
			driver=new FirefoxDriver();
			
		}
		
	}
	
}
