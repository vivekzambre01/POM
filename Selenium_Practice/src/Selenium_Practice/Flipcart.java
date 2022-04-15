package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		  List<WebElement> link = driver.findElements(By.tagName("a"));
		             System.out.println(link.size()); 
		             for(int i=0;i<link.size();i++)
		             {
		            	 System.out.println(link.get(i).getText());
		             }
//		  for (WebElement element : link) {
//		         String Strlink = element.getText();
//		         System.out.println(Strlink);
//		     System.out.println(element.getSize()); 
//		}
		
	}

}
