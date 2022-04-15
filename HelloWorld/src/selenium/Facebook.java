package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	WebElement	nv=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	
	      nv.sendKeys("samsung");
	      nv.click();
	     WebElement gh = driver.findElement(By.xpath("//a[@class='gb_g']"));
	     gh.click();
	      

	}

}
