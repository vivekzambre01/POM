package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\FireFox\\geckodriver.exe");
		WebDriver driver=  new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
		
		

	}

}
