package yourproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/Vivek/Desktop/Table.html");
	  int rowSize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr")).size();
	   System.out.println("Total no of rows  "+rowSize);
	   
   int colNo = driver.findElements(By.xpath("(//table[@id='1234']/tbody/tr)[2]/td")).size();
	   System.out.println("Total no of row no   "+colNo);
		
	}

}
