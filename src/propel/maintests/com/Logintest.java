package propel.maintests.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import propel.pageclasses.com.LoginPage;
import propel.utility.com.GenericUtility;
import propel.utility.com.Propelbaseclass;

public class Logintest extends Propelbaseclass {
	//WebDriver driver;
	

  @DataProvider(name="cred")
  public Object[][] loginCred()
  {
	  return new Object[][]  {{"vivek.pati@hpe.com","test"}};
  }

  @Test(dataProvider="cred")
  public void logintest(String name,String password) 
  {
	  System.out.println("B4 page factory");
	  LoginPage login_page=PageFactory.initElements(driver,LoginPage.class); 
	  System.out.println("Test Test");
	  login_page.enterLoginInfo(name,password);
	  login_page.selectTenant();
	  
  }
  
  
}
