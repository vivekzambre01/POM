package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Composite_listbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
      driver.get("https://en-gb.facebook.com/r.php");
         driver.manage().window().maximize();
                 
               WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
                Actions act=new Actions(driver);
                Thread.sleep(2000);
                act.click(month).perform();
                Thread.sleep(2000);
                for(int i=1;i<12;i++) {
                act.sendKeys(Keys.ARROW_DOWN).perform();
                if(i==5)
                {
                	act.sendKeys(Keys.ENTER);	
                	break;
                }
              
      
                } 
	}
	}


