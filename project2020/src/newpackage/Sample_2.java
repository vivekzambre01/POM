package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	      driver.get("https://en-gb.facebook.com/r.php");
	       boolean disply = driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i")).isDisplayed();
	       System.out.println(disply);
	       if(disply==true) {
	    	   System.out.println("facebook is displayed");
	       }else
	       {
	    	   System.out.println("facebook is not displayed");
	       }
	       
	}

}
