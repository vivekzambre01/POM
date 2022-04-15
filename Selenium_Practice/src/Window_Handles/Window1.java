package Window_Handles;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");	
		 String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.findElement(By.id("newWindowsBtn")).click();
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
	  Iterator<String> it = handles.iterator();
	  String parentw = it.next();
	  System.out.println("parent window id:"+parentw);
	  System.out.println(driver.getTitle());
	  Thread.sleep(4000);
	    String childw1 = it.next();
	    System.out.println("child windlow id1:"+childw1);
	    System.out.println(driver.getTitle());
	    Thread.sleep(4000);
	    String childw2 = it.next();
	    System.out.println("child windlow id2:"+childw2);
	    System.out.println(driver.getTitle());
	   Thread.sleep(4000);
	   driver.switchTo().window(childw1);
	   driver.findElement(By.id("firstName")).sendKeys("vivek");
	   

}
}