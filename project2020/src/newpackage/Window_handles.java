package newpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	      driver.get("https://skpatro.github.io/demo/links/");
	      Thread.sleep(2000);
	      //click on new tab button
	        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	        //2 get an address of main page
	            String mainwindow = driver.getWindowHandle();
	            System.out.println("main page id"+mainwindow);
	            //3 get an address of main page and child browser
	             Set<String> ids = driver.getWindowHandles();
	            System.out.println("-main page & child window ids-");
	            for (String id : ids) {
					System.out.println(id);
				}
	            Thread.sleep(10000);
	            //4 switch to main page
	            driver.switchTo().window(mainwindow);
	            Thread.sleep(3000);
                //5 click on new window button on main page
		   //  WebElement hgf = driver.findElement(By.xpath("//input[@name='NewTab']"));
		    // System.out.println(hgf);
                  Thread.sleep(5000);
                  driver.close();
                 
	            
	            
	            
	            
	            
	            
	            
	            
	            
	      
		
		
	}

}
