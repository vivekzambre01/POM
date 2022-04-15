package Drag_and_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_E {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();
		WebElement sourceText = driver.findElement(By.xpath("//span[text()='Your two files will be displayed side by side along, ']"));
		sourceText.click();
		Actions actions= new Actions(driver);
		Thread.sleep(2000);
		actions.keyDown(sourceText, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		WebElement dest = driver.findElement(By.xpath("(//*[@id=\"dropZone2\"]//div[2]//pre)[6]"));
		Thread.sleep(2000);
		actions.keyDown(dest, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		

	}

}
