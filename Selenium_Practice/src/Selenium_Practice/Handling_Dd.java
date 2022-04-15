package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Dd {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	       driver.get("https://en-gb.facebook.com/");
	       driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	    List<WebElement> month = driver.findElements(By.xpath("//*[@id='month']"));
	         System.out.println(month.size());
	         for (WebElement e : month) {
				System.out.println(e.getText());
				if(e.getText().equals("Feb"))
				{
					e.click();
					break;
				}
			}

}
}

