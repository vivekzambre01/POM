package newprogrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		    
		     WebElement element = driver.findElement(By.xpath("//*[@id=\"email\"]"));
//		     
//		     WebDriverWait wait=new WebDriverWait(driver, 10);
//		     
//		     wait.until(ExpectedConditions.visibilityOf(element));
//		     
		     element.click();

	}

}
