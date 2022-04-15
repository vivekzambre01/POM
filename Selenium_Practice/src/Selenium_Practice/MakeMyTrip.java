package Selenium_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		String hh = driver.findElement(By.xpath("//div[@id='SW']/div/div[2]/div/div/nav/ul/li[1]/a/span[2]")).getText();
		System.out.println(hh);
	}

}
