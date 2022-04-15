package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_Registration {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       //driver.get("http://www.facebook.com/");
       driver.get("https://en-gb.facebook.com/");
   
       driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("vivek");
       driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("zambre");
       driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8600632198");//why we use only name Locator
       Thread.sleep(2000);
       driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("8600632198");
       Thread.sleep(2000);
   //    WebElement day = driver.findElement(By.id("//select[@id='day']"));
         WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
         Select s= new Select(day);
       s.selectByIndex(10);
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select s1=new Select(month);
        s1.selectByVisibleText("Feb");
         WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
           Select s2= new Select(year);
           s2.selectByValue("1997");
           Thread.sleep(2000);
         WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
         male.click();
                driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
           
       
      
    		   
    		   
	}

}
