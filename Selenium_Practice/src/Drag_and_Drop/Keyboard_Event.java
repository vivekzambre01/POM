package Drag_and_Drop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Event {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		act.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys("vivek")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys("8600632198")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2))
		.sendKeys("hgjhg5454@hgh")
		.build()
		.perform();
		
		

	}

}
