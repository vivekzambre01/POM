package Random;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generator {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> textDemo = driver.findElements(By.xpath("//*[contains(text(),'Google Search')]"));
		System.out.println("Number of web elements: " +textDemo.size());
		driver.quit();
		
		}
		
       	}

