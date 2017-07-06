package propel.maintests.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import propel.pageclasses.com.LoginPage;
import propel.utility.com.Propelbaseclass;

public class Logintest extends Propelbaseclass {
	WebDriver driver;
	
  @Test
  public void logintest() throws InterruptedException 
  {
	  Logintest logintestobj=new Logintest();
	  driver=logintestobj.startBrowser("chrome", "https://pplui-cid6.itcs.hp.com/requestmanagement/_/Account/LogOn?returnUrl=%2Frequestmanagement%2F");
	  System.out.println("B4 page factory");
	  LoginPage login_page=new LoginPage(driver);
	
	  //Thread.sleep(25000);
	  System.out.println("Test Test");
	  login_page.enterLoginInfo();
  }
}
