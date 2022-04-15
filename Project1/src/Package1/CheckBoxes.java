package Package1;

import javax.management.Notification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(ops);
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj'] //*[contains(text(),'Family & Friends')]")).isSelected();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj'] //*[contains(text(),'Family & Friends')]")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj'] //*[contains(text(),'Family & Friends')]")).isSelected();
      System.out.println(driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-m611by']")).getSize());
	}
  
}
