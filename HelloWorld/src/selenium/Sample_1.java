package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php");
           Thread.sleep(2000);
          driver.get("https://www.google.com/");
          driver.navigate().back();
          driver.navigate().forward();
          driver.get("https://www.amazon.com/");
          driver.navigate().refresh();
          String window = driver.getWindowHandle();
          System.out.println(window);
                       
   
           
        
        
	}

}
