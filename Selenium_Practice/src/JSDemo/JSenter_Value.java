package JSDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSenter_Value {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
	 JavascriptExecutor js= (JavascriptExecutor)driver;
	WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
	
	js.executeScript("arguments[0].value='random@gmail.com'",email);
	Thread.sleep(3000);
	 WebElement checkbox = driver.findElement(By.xpath("//input[@id='persistent']"));
	 js.executeScript("arguments[0].click()",checkbox);
	 
	
	
	 
	 
	 
	 

	}

}
