package propel.maintests.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import propel.pageclasses.com.LoginPage;
import propel.utility.com.GenericUtility;
import propel.utility.com.Propelbaseclass;

public class Logintest extends Propelbaseclass {
	//WebDriver driver;
	
	
  @Test
  public void logintest() throws InterruptedException 
  {
	  System.out.println("B4 page factory");
	  LoginPage login_page=PageFactory.initElements(driver,LoginPage.class); //new LoginPage(driver);
	  //Thread.sleep(25000);
	  System.out.println("Test Test");
	  //login_page.enterLoginInfo();
	  login_page.enterLoginInfo();
	  
	  login_page.selectTenant();
	  
  }
  
  
}
