package Drag_and_Drop;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
    driver.get("https://www.demoqa.com/droppable/");
       driver.manage().window().maximize();
           WebElement source = driver.findElement(By.id("draggable"));
         System.out.println("source"+source.getText());
                WebElement dest = driver.findElement(By.id("droppable"));
                System.out.println("target"+dest.getText());
                Actions act=new Actions(driver);
                act.moveToElement(source).clickAndHold().moveToElement(dest).release().build().perform();
                
		
		
		
	}

}
