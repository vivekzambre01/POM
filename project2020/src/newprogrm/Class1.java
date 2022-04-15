package newprogrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.amazon.in/");
	  WebElement amazon = driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']"));
		  String amazon1 = amazon.getText();
		  System.out.println(amazon1);
		         driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung");
	
		
		
		    
		    
		
		
	}

}
