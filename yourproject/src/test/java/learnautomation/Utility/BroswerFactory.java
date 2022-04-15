package learnautomation.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BroswerFactory {
	
     
	
	public static WebDriver startApplication(WebDriver driver,String broswername,String appurl)
	{
		if(broswername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Vivek\\eclipse-workspace\\yourproject\\Broswers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}	
		else if(broswername.equals("IE")) 
		{   System.setProperty("webdriver.ie.driver","C:\\Users\\Vivek\\eclipse-workspace\\yourproject\\Broswers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(broswername.equals("FireFox"))
		{   System.setProperty("webdriver.gecko.driver","C:\\Users\\Vivek\\eclipse-workspace\\yourproject\\Broswers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else	
		{
			System.out.println("we do not suppport this broswer");
		}
			driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			return driver;
		}
	
	   public static void quitBroswer(WebDriver driver) 
	   {
		   driver.quit();
		
	   }
	

	
}
