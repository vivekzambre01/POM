package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	
		  WebElement usern = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		  usern.sendKeys("8600632198");
		  WebElement passw = driver.findElement(By.xpath("//input[@type='password']"));
		  passw.sendKeys("Test@123");
		  Thread.sleep(5000);
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		 driver.findElement(By.xpath("//a[@class='_3SkBxJ']")).click();
		  
		  
		  
		  
		
		
	}
}
