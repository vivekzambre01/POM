package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='createacc']")).click();
		// id write username
		driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("vivek");
		driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys("zambre");
		driver.findElement(By.xpath("//a[@id='usernamereg-altreg']")).click();
		driver.findElement(By.xpath("//input[@id='usernamereg-email']")).sendKeys("vivekzambre5003@gmail.com");
		driver.findElement(By.xpath("//input[@id='usernamereg-password']")).sendKeys("Test@123");
	//	driver.findElement(By.id("//input[@id='usernamereg-phone']")).sendKeys("8600632198");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='usernamereg-month']"));
		Select s= new Select(month);
		s.selectByVisibleText("Februry");
	      
		
		
		
//
	}
}
