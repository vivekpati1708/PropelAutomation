package propel.utility.com;

import org.testng.Reporter;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericUtility {
  
	
	public static void captureScreenshot(WebDriver driver,String screenshotName)
	{
	 
	try 
	{
	TakesScreenshot ts=(TakesScreenshot)driver;
	 
	File source=ts.getScreenshotAs(OutputType.FILE);
	 
	FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
	 
		Reporter.log("Screenshot taken for Testcase");
	} 
	catch (Exception e)
	{
	 
		Reporter.log("Exception while taking screenshot "+e.getMessage());
	} 
	}
	
// =========================================================================================	
	public static WebElement isElementPresnt(WebDriver driver,String xpath,int time)
	{ 
		WebElement ele = null;
		for(int i=0;i<time;i++)
		{
			try{
			ele=driver.findElement(By.xpath(xpath));
			break;
		}
		catch(Exception e)
		{
			try 
			{
				Thread.sleep(1000);
				
			} 
			catch (InterruptedException e1) 
			{
				Reporter.log("Waiting for element to appear on DOM");
			}
		}		 
		}
	return ele;
	}
	 
}


