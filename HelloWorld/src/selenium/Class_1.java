package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Class_1 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
	      driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vivek");
	      driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("zambre");
	     WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	      WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	      Select s=new Select(day);
	      Select s1=new Select(month);
	      s.selectByIndex(10);
	      s.selectByValue("feb");
	      
	 
	             List<WebElement> ref = s.getOptions();
	             for (WebElement mon : ref) {
	            	 System.out.println(mon.getText());
					
				}
	      
	}

}
