package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firefox {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.gecko.driver","C:\\firefox\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.get("https://www.facebook.com/");
      WebElement element = driver.findElement(By.xpath("//input[@id='u_0_m']"));
      element.sendKeys("vivek");
    WebElement lastname = driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"));
    lastname.sendKeys("zambre");
        
	}

}
