package Framework2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
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
		openBroswer();
		login1=new Kitelogin1Page(driver);
	    login2=new KiteLogin2Page(driver);
	      home  =new KiteHomePage(driver);
	}
	
    @BeforeMethod
    public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException 
    {
    login1.setKiteLogin1PageUN(Utility.getTextData(0, 0));
    login1.setKiteLogin1PagePWD(Utility.getTextData(0,1));
    login1.clickKiteLoginButton();
               Thread.sleep(3000);
               
    login2.setKiteLogin2Pagepin(Utility.getTextData(0, 2));
     login2.clickKiteLogin2Pagecontinue();
         Reporter.log("loginToApp", true);
                Thread.sleep(3000);
    }
      @Test(description = "test case run successfully")
      public void verifyprofilenameinkite() throws InterruptedException, EncryptedDocumentException, IOException 
      {
     String actual ="KV";
    String expected = Utility.getTextData(0, 3);
    
   
    
    Assert.assertEquals(actual, expected,"expected and actual result are mismatched");
               
           Thread.sleep(4000);
           Reporter.log("varifyprofilenameinkite",true);
    
      }
      @AfterMethod
      public void logoutFromApp(ITestResult result) throws IOException {
    	  if(result.getStatus()==ITestResult.FAILURE)
    	  {
    		  Utility.CaptureScreenshot(driver);
    		  }
    	    Reporter.log("logout From App",true);  
    	    }
      
      @AfterClass
      public void closeBroswer() {
    	  Reporter.log("close Broswer",true);
    	  driver.quit();
             }
      
}
