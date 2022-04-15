package Broswerfactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LogintestCRM extends BroswerFactory{
	
	WebDriver driver;
	
	@Test
	public void loginApp() 
	{
		 WebDriver abc = BroswerFactory.startApplication(driver, "chrome","https://www.google.com/");
		   System.out.println(abc.getTitle());
		  		   
	}
	

}
