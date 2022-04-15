package newpackage;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample_ {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
       driver.get("https://en-gb.facebook.com/r.php");
           WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
          Actions act=new Actions(driver);
         act.click(month).perform();
           Thread.sleep(2000);
           for(int i=1;i<=12;i++) {
        	   act.sendKeys(Keys.ARROW_UP).perform();
        	   Thread.sleep(2000);
        	   }
           //navigate  to an may field
           for(int i=1;i<=12;i++) {
        	   act.sendKeys(Keys.ARROW_DOWN).perform();
        	   Thread.sleep(2000);
        	   if(i==1)
        	   {
        	   act.sendKeys(Keys.ENTER).perform();
        	   break;
           }
        	   
          
          
          
       
	}
	}
}
