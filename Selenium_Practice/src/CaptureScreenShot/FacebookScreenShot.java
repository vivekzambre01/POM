package CaptureScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Library.Utility;


public class FacebookScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com/");
		
		Utility.capturescreenshot(driver, "BroswerStarted");
		driver.manage().window().maximize();
		
		  driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
		  
		  Utility.capturescreenshot(driver, "TypeName");
		   
	      
	        driver.quit();
		  

	}

}
