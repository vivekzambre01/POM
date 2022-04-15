package Drag_and_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drap_Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		//Action class
		Actions act= new Actions(driver);
		act.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
		.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
		.release()
		.build()
		.perform();
		

	}

}
