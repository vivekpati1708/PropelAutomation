package propel.maintests.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import propel.utility.com.ExcelUtility;

public class DashboardTest {
	
	@DataProvider(name="loginCred")
	public Object[][] loginCred()
	{
		ExcelUtility obj = new ExcelUtility();
		  
		  Object[][] data =obj.GetCellValue("LoginData",4,"currency");
		  
		  Object[][] dataRow = obj.getAllRows("LoginData");
		  
		  return data;
	}
  @Test(dataProvider="loginCred")
  public void f(String pwd) {
	  //System.out.println("Vivek");
	  //System.out.println("Result="+pwd);	  
  }
  
}
