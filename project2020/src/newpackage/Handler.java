package newpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handler {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		 String mainwindow = driver.getWindowHandle();
		  System.out.println(mainwindow);
		 Set<String> ids = driver.getWindowHandles();
		 Iterator<String> id = ids.iterator();
         String child = id.next();
         System.out.println(child);
          String parent = id.next();
          System.out.println(parent);      
		                
	}
	
		  
}
	


