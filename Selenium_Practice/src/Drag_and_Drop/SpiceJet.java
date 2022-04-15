package Drag_and_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://spicejet.com/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Priority Check-in")).click();
		
		
		

	}

}
