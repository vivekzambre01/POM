package learnautomation.Utility;


import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RunningBroswerFactory {
	
	WebDriver driver;
	
	@Test
	public void login() {
	 driver = BroswerFactory.startApplication(driver, "chrome","https://www.facebook.com/");
		//System.out.println(xyz);
	}

}
