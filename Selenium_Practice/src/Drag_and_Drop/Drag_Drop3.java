package Drag_and_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);
	   WebElement drag = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
        Actions act= new Actions(driver);
       
        act.clickAndHold(drag).moveByOffset(100,50).release(drag).build().perform();
        Thread.sleep(4000);
        driver.close();
	}

}
