package Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WordPress {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver","C:\\Program Files\\FireFox\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		

	}

}
