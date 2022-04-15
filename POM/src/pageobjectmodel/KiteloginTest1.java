package pageobjectmodel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteloginTest1  extends  BrosweFactory{
// WebDriver driver;
	 Kitelogin1Page  login1;
	 KiteLogin2Page login2;
	 KiteHomePage home ;
	
	
	@BeforeClass
	public void openbroswer() {
		Reporter.log("open broswer", true);
		main();
		login1=new Kitelogin1Page(driver);
	    login2=new KiteLogin2Page(driver);
	      home  =new KiteHomePage(driver);
	}
	
    @BeforeMethod
    public void loginToApp() throws InterruptedException 
    {
    login1.setKiteLogin1PageUN("DV1510");
    login1.setKiteLogin1PagePWD("Pass@123");
    login1.clickKiteLoginButton();
               Thread.sleep(3000);
    login2.setKiteLogin2Pagepin("959594");
     login2.clickKiteLogin2Pagecontinue();
                Thread.sleep(3000);
    }
      @Test(description = "test case run successfully")
      public void verifyprofilenameinkite() throws InterruptedException 
      {
     home.verifyKiteHomePageName();
           Thread.sleep(4000);
    
      }
      @AfterMethod
      public void logoutFromApp(ITestResult result) throws IOException {
    	  if(result.getStatus()==ITestResult.FAILURE)
    	  {
    		  Utility.CaptureScreenshot();
    		 
    	  }
    	    Reporter.log("logout From App",true);  
      }
      
      @AfterClass
      public void closeBroswer() {
    	  Reporter.log("close Broswer",true);
             }
   
}
