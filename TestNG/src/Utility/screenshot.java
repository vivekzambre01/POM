package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {

	
	public static void capturescreenshot(WebDriver driver,String screenshotName)
	
	{
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
		   try {
			FileUtils.copyFile(src,new File("./ScreenShot/"+screenshotName+".png"));
		} catch (Exception e) {
		
			System.out.println("Exception while taking Screenshot"+e.getMessage());
		}

	}
	
}
