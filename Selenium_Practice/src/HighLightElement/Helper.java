package HighLightElement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Helper {

		
		public static void HighLightElement(WebDriver driver, WebElement element) {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].setAttribute('style','background:yello;border: 2px solid;",element);
			
			try
			{
				Thread.sleep(5000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
			js.executeScript("arguments[0].setAttribute('style','border': solid 2px white')",element);
		}
	}
