package ActionDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	   driver.manage().window().maximize();
	   driver.findElement(By.cssSelector(".blinkingText")).click();
	   Set<String> windows = driver.getWindowHandles();  //Parent id , child windows
	        Iterator<String> it = windows.iterator();
	        String parentID = it.next();
	          String childID = it.next();
	       driver.switchTo().window(childID);
	     System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
	    String emailID = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	    driver.switchTo().window(parentID);
	     driver.findElement(By.id("username")).sendKeys(emailID);
	     
	     
	     
	     
	}

}
