package Drag_and_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestiondropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	     driver.get("https://www.makemytrip.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	   /* 
	    driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[5]/div[1]/p")).click();
	    driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("8600632198");
	    //click to button
	    driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")).click();
	   */ 
	 driver.findElement(By.xpath("//*[@id=\"fromCity\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"fromCity\"]")).click();

	    WebElement from= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
	    from.sendKeys("sydney");
	    Thread.sleep(2000);
	    from.sendKeys(Keys.ARROW_DOWN);
	    Thread.sleep(2000);
	    from.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	   WebElement to = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	   to.click();
	   to.sendKeys("mumbai");
	   to.sendKeys(Keys.ARROW_DOWN);
	   Thread.sleep(2000);
	   to.sendKeys(Keys.ENTER);
	  // click on search
	   driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
	   driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
    
	    
	    
	    
	}

}
