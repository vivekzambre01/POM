package TestNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class demo4 {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  File dest=new File("C:\\Users\\Vivek\\Screenshot\\img1.jpg"); 
	  
	//  File dest=new File("C:\\Users\\Vivek\\eclipse-workspace\\POM\\screenshot\\img1.jpg");
	  
	  FileHandler.copy(src, dest);
	}

}
