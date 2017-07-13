package propel.maintests.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import propel.pageclasses.com.AdminPage;
import propel.pageclasses.com.CreateRootCatPage;
import propel.pageclasses.com.DashboardPage;
import propel.pageclasses.com.LoginPage;
import propel.pageclasses.com.ServiceCatalogAdminPage;
import propel.utility.com.GenericUtility;
import propel.utility.com.Propelbaseclass;

public class Logintest extends Propelbaseclass {
	//WebDriver driver;
	
	
  @Test
  public void logintest() throws InterruptedException 
  {
	  System.out.println("Logging into Propel");
	  LoginPage login_page=PageFactory.initElements(driver,LoginPage.class); //new LoginPage(driver);
	  //Thread.sleep(25000);
	  
	  //login_page.enterLoginInfo();
	  login_page.enterLoginInfo();
	  System.out.println("Selecting Tenant");
	  login_page.selectTenant();	  
	  
  }
  
  
}
