package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		 WebElement dropd = driver.findElement(By.name("country"));
	/*	//select[@name='country']
		Select s= new Select(dropd);
		//select by index
		Thread.sleep(2000);
		s.selectByIndex(10);
		Thread.sleep(3000);
		//select by visible text
		s.selectByVisibleText("INDIA");
		Thread.sleep(3000);
		//select by value
		s.selectByValue("ALBANIA");
		*/
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//select[@name='country']/option[text()='ERITREA']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//select[@name='country']/option[2]")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//select[@name='country']/option[@value='ANGOLA']")).click();
		
	}

}
