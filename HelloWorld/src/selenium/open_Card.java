package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class open_Card {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php");
	WebElement	mac=driver.findElement(By.xpath("//input[@name='search']"));
	mac.sendKeys("mac");
	              driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
	 
	    
	  //  Select s =new Select((WebElement) driver.findElements(By.id("input-sort")));
	   // s.selectByVisibleText("Price(High>Low)");
	   // s.selectByIndex(5);
	    
	    
	    
	  
	}

}
