package propel.utility.com;

import org.testng.Reporter;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
	 /**
	  * Excel method the read the data from the excel. 
	  * 
	  */
	public void GetData()
	{
		File xlsSrc = new File("..\\PropelAutomation\\src\\propel\\data\file\\PropelData.xlsx");
		System.out.println("Inside0");
		try
		{
			System.out.println("Inside1");
		FileInputStream xlxFis = new FileInputStream(xlsSrc);
		
		XSSFWorkbook wb = new XSSFWorkbook(xlxFis);

		//For xlx file we will be using the class. 
		//HSSFWorkbook wb1 = new HSSFWorkbook(xlxFis);

		XSSFSheet loginData =wb.getSheet("LoginData"); // To get sheet as per the sheet name. 
		//wb.getSheetAt(0);// Fetch you the 1st sheet as the index start from zero. 
		
		String userName = loginData.getRow(1).getCell(0).getStringCellValue();
		String passworkd = loginData.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println("Username="+userName);
		System.out.println("Pwd="+passworkd);
		wb.close();
		
		}
		catch(IOException e)
		{
			
		}
		
	}
	
	public static void main(String[] args) {
		
		GenericUtility obj = new GenericUtility();
		System.out.println("Test");
		obj.GetData();
	}
}


