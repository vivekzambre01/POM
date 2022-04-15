package JSDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollpage {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
	 //   JavascriptExecutor js= (JavascriptExecutor)driver;
        ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
        
        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("scroll(0,-500)");
		
		             
		
	}

}
