package excelsheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		  
	}

}
