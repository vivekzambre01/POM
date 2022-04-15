import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteloginTest1 {
	WebDriver driver;
		public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String abc = driver.findElement(By.xpath("(//header[@class='header text-center'])")).getAttribute("kite");
		System.out.println(abc);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
     String p = driver.findElement(By.xpath("//input[@type='password']")).getCssValue("password");
      System.out.println(p);
       boolean a = driver.findElement(By.xpath("//input[@type='password']")).isSelected();
         System.out.println(a);     
        boolean b = driver.findElement(By.xpath("//input[@type='password']")).isEnabled();
		System.out.println(b);
	 boolean c = driver.findElement(By.xpath("//input[@type='password']")).isDisplayed();
	      System.out.println(c);
	
			
		
		
		
		
		
		
		

	}

}
