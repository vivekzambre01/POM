package ActionDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
         List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
         for (WebElement link : links) {
			
		}
	}

}
