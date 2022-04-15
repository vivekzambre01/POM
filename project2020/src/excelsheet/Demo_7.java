package excelsheet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_7 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/");
           WebElement ggjh = driver.findElement(By.xpath("//select[@id='day']"));
	    Select s=new Select(ggjh);
	       List<WebElement> alloptions = s.getOptions();
	        for (WebElement element : alloptions) {
	       	System.out.println(element.getText());
			
			}
	        
	  
		
		
		
		
		
	}

}
