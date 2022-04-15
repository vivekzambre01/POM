package HighLightElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTestCases {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		Helper.HighLightElement(driver,username);
		username.sendKeys("vivek");
		WebElement password = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		Helper.HighLightElement(driver,password);
		password.sendKeys("Test@233");
		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"u_0_d_/O\"]"));
		loginbutton.click();
		
		
	}

}
