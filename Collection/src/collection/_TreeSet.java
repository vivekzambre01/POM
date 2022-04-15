package collection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _TreeSet {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement option = driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
	option.sendKeys("testNG");
	    List<WebElement> option1 = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	    System.out.println(option1.size());
	    String exp = "testng  tutorial";
	    for (WebElement ele : option1) {
	    	String act = ele.getText();
	    	System.out.println(act);
	    	if(act.equals(exp)) {
	    		System.out.println("pass");
	    	}else
	    	{
	    		System.out.println("fail");
	    	}
			
		}
	    
	
	
	
			
	

		
	}

}
