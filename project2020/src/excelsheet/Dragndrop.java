package excelsheet;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragndrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
       Actions act =new Actions(driver);
       driver.get("https://www.testandquiz.com/selenium/testing.html");
         Thread.sleep(3000);
         driver.manage().window().maximize();
          Thread.sleep(5000);
           WebElement source = driver.findElement(By.xpath("//button[text()='Generate Alert Box']"));
                act.moveToElement(source).click().build().perform();
                Alert alt = driver.switchTo().alert();
                     alt.accept();
                     Thread.sleep(4000);
          WebElement dest = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));       
                   act.moveToElement(dest).doubleClick(dest).build().perform();
                   Alert alt1 = driver.switchTo().alert();
                   alt.accept();
                   Thread.sleep(2000);
                  
                   
          
    //     Alert alt = driver.switchTo().alert();
     //          alt.accept();
           //  WebElement dest = driver.findElement(By.xpath("//div[@id='targetDiv']"));
        //     act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
     // act.dragAndDrop(source, dest).release().build().perform();
    
                  //  act.moveToElement(source).click().build().perform();
                    
 
  
 
          
       
       
	}

	
}
