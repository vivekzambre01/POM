package ActionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
      
		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	     System.out.println(driver.findElement(By.tagName("a")).getSize());
	     
	     WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	     
	    System.out.println(footerdriver.findElement(By.tagName("a")).getSize());

	    
	    //
	   WebElement columndriver = footerdriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td/ul/li[3]"));
	   
	   System.out.println(columndriver.findElement(By.tagName("a")).getSize());
	   
	   //click on each link of the column to check the link is open or not
	   
	   for ( int i=0;i<5;i++)
          {
	       String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
	       
           }
	}

}
