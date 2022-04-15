package ActionDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuatorDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
       js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
       driver.manage().window().maximize();
       List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
       
       int sum=0;
       for (int i=0;i<values.size();i++)
       {
    	   sum= sum +Integer.parseInt(values.get(i).getText());
       }
       System.out.println(sum); 
       driver.findElement(By.cssSelector(".totalAmount")).getText();
       
        
	}

}
