package JSDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_method {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vivek mukhrji");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='persistent']")).click();
		
		  JavascriptExecutor js= (JavascriptExecutor)driver;
		  js.executeScript("document.getElementById('persistent').click()");
		  
		 

	}

}
