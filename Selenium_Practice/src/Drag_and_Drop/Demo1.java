package Drag_and_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		
		Actions act= new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//span[text()='Books']"));
		WebElement dest = driver.findElement(By.xpath("//li[text()='History']"));
		act.clickAndHold(src).moveToElement(dest).release().build().perform();
		
		

	}

}
