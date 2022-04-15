package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggesion {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com/");
         driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Mob");
        List<WebElement> autosuggesion = driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li"));
        
        for (WebElement autos : autosuggesion) {
        	
        	autos.getSize();
     	
		
        	if(autos.getText().equalsIgnoreCase("mobile phone"))
     	{
      		autos.click();
       		break;
       	}
        	
		}
		
	
	}

}
