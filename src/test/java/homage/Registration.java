package homage;



import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Config.DriverManager;
import Config.LOCELEMENT;
import Config.Util;

public class Registration extends Util {


	
	@BeforeTest
	public void setup (){
		

		DriverManager.getInstance();

		
	}
	


	
  @Test
  public void f() {
	  
	  setup();
	  
	  //request help
	  IsPresence (DriverManager.androiddriver, By.xpath(LOCELEMENT.REQUESTHELP_XPATH));
	  DriverManager.androiddriver.findElement(By.xpath(LOCELEMENT.REQUESTHELP_XPATH)).click();
	  
	  //Who needs care
	  IsPresence (DriverManager.androiddriver, By.xpath(LOCELEMENT.REQUESTLOVED_XPATH));
	  DriverManager.androiddriver.findElement(By.xpath(LOCELEMENT.REQUESTLOVED_XPATH)).click();
	  
	  //Telephone
	  IsPresence (DriverManager.androiddriver, By.xpath(LOCELEMENT.TELEFIELD_XPATH));
	  DriverManager.androiddriver.findElement(By.xpath(LOCELEMENT.TELEFIELD_XPATH)).sendKeys(LOCELEMENT.TELEPHONE);
	  
	 AndroidScrollDown( DriverManager.androiddriver,0, 0,0, 100 );
	  
	  //Email
	  IsPresence (DriverManager.androiddriver, By.xpath(LOCELEMENT.EMAIL_XPATH));
	  DriverManager.androiddriver.findElement(By.xpath(LOCELEMENT.EMAIL_XPATH)).sendKeys(Util.randomEmail());
	  
	  //Password
	  DriverManager.androiddriver.findElement(By.xpath(LOCELEMENT.PASSWORD_XPATH)).sendKeys(LOCELEMENT.PASSWORD);
	  
	  //Next
	  DriverManager.androiddriver.findElement(By.xpath(LOCELEMENT.NEXT_XPATH)).click();
	  
	  //Send Confirmation Code
	  IsPresence (DriverManager.androiddriver, By.xpath(LOCELEMENT.REQUESTINSTANT_XPATH));
	  DriverManager.androiddriver.findElement(By.xpath(LOCELEMENT.REQUESTINSTANT_XPATH)).click();
	  
	  
  }
}
