package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DDF_pgm1 {

	public static void main(String[] args) throws InterruptedException {
     ChromeOptions option=new  ChromeOptions();
     option.addArguments("----disable notifications--");
     System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://https://www.facebook.com/");
          driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("vivek");
          driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("zambre");
          driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("8600632198");
          driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("86006332198");
        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
              Select a=new Select(day);
              a.selectByValue("10");
              Thread.sleep(2000);
            WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
                   Select s=new Select(month);
                   s.selectByIndex(2);
         WebElement year = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _8esg'])[3]"));
                  Select s1=new  Select(year);
                  s1.selectByValue("1997");
                               
       
              //click on male   
          WebElement male = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
                 male.click();
                        WebElement signup = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
                      signup.click();
		
		
		
	}

}
