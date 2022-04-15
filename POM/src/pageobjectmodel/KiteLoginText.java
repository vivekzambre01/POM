package pageobjectmodel;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteLoginText {
	
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    Kitelogin1Page  login1=new Kitelogin1Page(driver);
	    
	  //  login1.setKiteLogin1PageUN("QN7806");
	    login1.setKiteLogin1PagePWD("84835@Vivek");
	    login1.clickKiteLoginButton();
	         Thread.sleep(3000);
	    KiteLogin2Page login2=new KiteLogin2Page(driver);
	    login2.setKiteLogin2Pagepin("123123");
	    
	    login2.clickKiteLogin2Pagecontinue();
	          Thread.sleep(3000);
	        		  
         KiteHomePage home  =new KiteHomePage(driver);
         home.verifyKiteHomePageName();
                Thread.sleep(4000);
                driver.quit();
   	

	}

}
