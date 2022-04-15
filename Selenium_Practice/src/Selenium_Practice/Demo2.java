package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		      WebElement yearb = driver.findElement(By.id("yearbox"));
		      yearb.click();
		      List<WebElement> year = driver.findElements(By.cssSelector("#yearbox >option"));
		      for (WebElement ele : year) {
				if(ele.getText().equals("1920"))
				
				{
					ele.click();
					break;
				}
				
			}
	
		
		                 
	}

}
