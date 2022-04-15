package Drag_and_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(iframe);
		
		
		WebElement drag = driver.findElement(By.id("draggable"));
		 WebElement drop = driver.findElement(By.id("droppable"));
		 Actions act= new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();

}
}
