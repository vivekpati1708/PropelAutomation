package propel.maintests.com;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import propel.pageclasses.com.LoginPage;
import propel.utility.com.Propelbaseclass;

public class Logintest extends Propelbaseclass {
	//WebDriver driver;
	
  @Test(dataProvider="cred")
  public void logintest(String name,String password) 
  {

	  System.out.println("Logging into Propel");
//	  LoginPage login_page=PageFactory.initElements(driver,LoginPage.class); //new LoginPage(driver);
//	  //Thread.sleep(25000);
//	  
//	  //login_page.enterLoginInfo();
//	  login_page.enterLoginInfo();
//	  System.out.println("Selecting Tenant");
//	  login_page.selectTenant();	  

	  //System.out.println("B4 page factory");
	  LoginPage login_page=PageFactory.initElements(driver,LoginPage.class); 
	  System.out.println("Test Test");
	  login_page.enterLoginInfo(name,password);
	  login_page.selectTenant();

	  
  }
  
  
}
