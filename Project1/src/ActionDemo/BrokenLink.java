package ActionDemo;



import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		 List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	      SoftAssert a =new SoftAssert();
		 
         for (WebElement link : links) {
	
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
       HttpsURLConnection conn=(HttpsURLConnection)new URL (url).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();
       int respcode = conn.getResponseCode();
       System.out.println(respcode);
           if(respcode>400)
           {
        	   System.out.println("The Link with the Text"+link.getText()+" is broken with the code"+respcode);
        
        	  
           }
        
	}
	}
}
