package pageobjectmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class PGM_1 {

	public static void main(String[] args) throws InterruptedException {
      
		ChromeOptions option =new ChromeOptions();
		option.addArguments("---disable notifications---");
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://kite.zerodha.com/");
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    //enter UN
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("DV1510");
	    
		//enter PWD
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Kite@123");
	    
	    //click on login
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	     Thread.sleep(4000);
	     
	     //enter pin
	     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("959594");
	     
	     //click on continue button
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     
	     String actual=driver.findElement(By.xpath("//div[@id='avatar-85']")).getText();
	     String expeted="KV";
	     if(actual.equals(expeted)) 
	     {
	  	 System.out.println("pass");
	     }else
	    {
	    	 System.out.println("fail");
	    }
	     driver.close();
	    
	}
}
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	    
        		
	

