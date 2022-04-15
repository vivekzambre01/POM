package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
     driver.get("https://www.amazon.in/");
         WebElement signinbutton = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
        Actions act=new Actions(driver);
        // move to element
        act.moveToElement(signinbutton).perform();
        Thread.sleep(2000);
        //right click
       act.contextClick().perform();
        act.moveToElement(signinbutton).contextClick().build().perform();
           Thread.sleep(2000);
           WebElement orders = driver.findElement(By.xpath("//button[text()='inspect']"));
             act.moveToElement(orders).perform();
              act.contextClick().perform();
              act.moveToElement(orders).contextClick().build().perform();
             
              
        
        
        
     
     
     
     
     
     
	}

}
