package ActionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	   driver.get("https://jqueryui.com/droppable/");
	   driver.manage().window().maximize();
	   System.out.println(driver.findElement(By.tagName("iframe")).getSize();
	   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
       // driver.findElement(By.id("draggable")).click();
	   Actions a= new Actions(driver);
          WebElement source=  driver.findElement(By.id("draggable"));
          WebElement target=  driver.findElement(By.id("droppable"));
          a.dragAndDrop(source, target).build().perform();
          driver.switchTo().defaultContent();
          

     

	}

}
