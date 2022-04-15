package Drag_and_Drop;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");	
		 String parentw = driver.getWindowHandle();
		System.out.println(parentw);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.findElement(By.id("newWindowsBtn")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		for (String handle : handles) {
			System.out.println(handle);
		
				driver.findElement(By.name("name")).sendKeys("vivekz");
			}
		}

}
