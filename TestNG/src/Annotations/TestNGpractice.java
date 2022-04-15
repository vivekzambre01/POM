package Annotations;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestNGpractice {

	static WebDriver  driver;
	
	@BeforeSuite
	public void initBroswer()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		Properties prop= new Properties();
		driver= new ChromeDriver();
	
	}
	@AfterSuite
	public void quiteBroswer()
	{
		
		driver.quit();
	}
}
