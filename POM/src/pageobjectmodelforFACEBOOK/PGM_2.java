package pageobjectmodelforFACEBOOK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PGM_2 {

	public static void main(String[] args) {
		
  		ChromeOptions option =new ChromeOptions();
		option.addArguments("---disable notifications---");
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login_page login=new  Login_page(driver); 
		login.firstname();
		login.lastname();
		login.mobileno();
		login.password();
		login.enterday();
		login.entermonth();
		login.enteryear();
		login.entermale();
		login.signup();
		
		
	
	
		
	}

}
