package Drag_and_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckB {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.sugarcrm.com/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"field28\"]/label")).click();
		driver.manage().deleteAllCookies();
		//driver.findElement(By.cssSelector("body > div.optanon-alert-box-wrapper > div.optanon-alert-box-bg > div.optanon-alert-box-button-container > div.optanon-alert-box-button.optanon-button-allow > div > button")).click();
		driver.findElement(By.xpath("//input[@id='interest_market_c0']")).click();
	//	driver.findElement(By.xpath("//input[@id='interest_market_c0']")).click();
	  int Size = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	  System.out.println(Size);//print size of checkbox

		
	}

}
