package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
	
		
		

	}

}
