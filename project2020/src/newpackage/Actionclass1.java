package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	      driver.get("https://www.amazon.in/");
	      WebElement Signinbutton = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
	         Actions  act=new Actions(driver);
	            act.moveToElement(Signinbutton).perform();
	           Thread.sleep(2000);
     WebElement yourorder = driver.findElement(By.linkText("Create a Wish List"));
	            act.moveToElement(yourorder).click().build().perform();
	 
	              
	}

}
