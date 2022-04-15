package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
//	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123 ");
		////*[@id="txtUsername"]
		//Xpath
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		//CSS Selector
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Admin123");
		//partial Link Text
		driver.findElement(By.partialLinkText("Forgot yo")).click();
		//Find total Img from page
		   int jj = driver.findElements(By.tagName("img")).size();
		   System.out.println(jj);
		}
}
