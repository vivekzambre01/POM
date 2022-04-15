package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locator2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s= new Select(dropdown);
		s.selectByIndex(1);
      System.out.println(s.getFirstSelectedOption().getText());
      s.selectByVisibleText("Option3");
      s.selectByValue("option2");
      
		
		
		
		
      
         
		
		

	}

}
