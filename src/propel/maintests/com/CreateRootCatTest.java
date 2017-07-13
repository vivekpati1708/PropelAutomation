package propel.maintests.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import propel.pageclasses.com.*;
import propel.utility.com.Propelbaseclass;

public class CreateRootCatTest extends Propelbaseclass {
	
  @Test(description="Enter Login creadentials",timeOut = 20000,priority=1)
  public void logintest()
  {
	  System.out.println("Logging into Propel");
	  LoginPage login_page=PageFactory.initElements(driver,LoginPage.class); //new LoginPage(driver);
	  //Thread.sleep(25000);
	  
	  //login_page.enterLoginInfo();
	  login_page.enterLoginInfo();
	  System.out.println("Selecting Tenant");
	  login_page.selectTenant();
  }
  
  @Test(description="Click on Admin tab",timeOut = 20000,dependsOnMethods="logintest")
  public void clickAdmin()
  {
	  System.out.println("Clicking on Admin Tab");
	  DashboardPage dashboard_page=PageFactory.initElements(driver,DashboardPage.class);
	  dashboard_page.clickAdmin();

  }
  
  @Test(description="Click on Service Catalog Admin option in Admin Page",timeOut = 20000,dependsOnMethods="clickAdmin")
  public void clickServiceCatalogAdmin()
  {
	  System.out.println("Clicking on Service Catalog Administration Link");
	  
	  AdminPage admin_page=PageFactory.initElements(driver, AdminPage.class);
	  admin_page.clickServiceCatalogAdmin();
  }
  
  @Test(description="Click on Root Category Option",timeOut = 20000,dependsOnMethods="clickServiceCatalogAdmin")
  public void clickRootCategory()
  {
	  System.out.println("Click on Root Category");
	  
	  ServiceCatalogAdminPage servicecatadmin_page=PageFactory.initElements(driver, ServiceCatalogAdminPage.class);
	  servicecatadmin_page.clickRootCat();
	  
  }
  
  @Test(description="Enter Details to create root Category Details",timeOut = 20000,dependsOnMethods="clickRootCategory")
  public void enterRootCatInfo()
  {
	  System.out.println("Enter Root Category Details");
	  
	  CreateRootCatPage createrootcat_page=PageFactory.initElements(driver,CreateRootCatPage.class);
	  createrootcat_page.createRootCat();
  }
  
}
