package newpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Doubleclickdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
    driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
    
    
		
		
	}

}
