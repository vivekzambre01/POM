package JSDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsdemoclick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("alert('welcome to deathmaker')");
		js.executeScript("prompt('welcome to deathmaker')");
		
				
	
	}

}
