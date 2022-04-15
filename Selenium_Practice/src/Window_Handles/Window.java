package Window_Handles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parenthandle = driver.getWindowHandle();
		System.out.println(parenthandle);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			System.out.println(handle);
			if(!handle.equals(parenthandle)) {
				driver.switchTo().window(handle);
			
			driver.findElement(By.id("firstName")).sendKeys("vivek");
			Thread.sleep(5000);
			driver.close();
			}
		}
		driver.switchTo().window(parenthandle);
		driver.findElement(By.id("name")).sendKeys("Reddy");
		Thread.sleep(5000);
	//driver.quit();
	}

}
