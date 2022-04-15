package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
      driver.get("https://www.facebook.com/");
       driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vivek");
      driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("zambre");
      driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("8600632198");
      driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("*****");
      driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
    boolean element = driver.findElement(By.xpath("//span[text()='Create an account']")).isDisplayed();
               System.out.println(element);
	}

}
