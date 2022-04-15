package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		//click on skillls
		 WebElement skilldp = driver.findElement(By.id("Skills"));
		 skilldp.click();
		 List<WebElement> skills = driver.findElements(By.xpath("//select[@id='Skills']/option"));
		 System.out.println(skills.size());
		 for (WebElement element : skills) {
			//System.out.println(element.getText());
			 if(element.getText().equals("Unix"))
			 {
				 element.click();
				 break;
			 }
		}

	}

}
