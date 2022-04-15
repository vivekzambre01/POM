package pageobjectmodel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
	 static WebDriver driver;
	
	public static void CaptureScreenshot() throws IOException {
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     File dest=new File("C:\\Users\\Vivek\\eclipse-workspace\\POM\\screenshot\\img2.jpg");
     FileHandler.copy(src, dest);
	}
	public static void excelsheet() 
	{
	    System.out.println();	
	}
	
	
	
	
	
}
