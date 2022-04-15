package Framework2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class BrosweFactory {
	static WebDriver driver;
	public static void openBroswer() {
		
		ChromeOptions option  =new ChromeOptions();
		option.addArguments("----disable-notification----");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vivek\\eclipse-workspace\\POM\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

