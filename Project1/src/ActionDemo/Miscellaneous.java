package ActionDemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class Miscellaneous {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.get("https://google.com/");
		     File  src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		     File dest = new File("C://Users//Vivek//eclipse-workspace//Project1//Screenshot//file1.png");
		     FileUtils.copyFile(src, dest);
	
		     
		     

	}

}
