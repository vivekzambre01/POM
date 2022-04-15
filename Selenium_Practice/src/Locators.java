import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
	       System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	       driver.get("https://rahulshettyacademy.com/locatorspractice/");
	       driver.findElement(By.id("inputUsername")).sendKeys("Rahul");
	       driver.findElement(By.name("inputPassword")).sendKeys("hello123");
	       driver.findElement(By.className("signInBtn")).click();
	       System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	       driver.findElement(By.linkText("Forgot your password?")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Vivek");
	       driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ivv@hhh65gmail.com");
	       driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("8600235687");
	       driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
	       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
          driver.findElement(By.cssSelector("p.infoMsg")).getText();
          driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
          driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Rahul");
        driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("Rahulshettyacademy");
      driver.findElement(By.xpath("//div[@class='checkbox-container']/span/input[@name='chkboxTwo']")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit signInBtn')]")).click();
        
     
  
	}

}
