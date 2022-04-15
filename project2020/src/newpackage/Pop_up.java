package newpackage;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_up {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		//click on new tab
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	//driver.findElement(By.xpath("(//input[@class='btn'])[4]")).click();
        String ar1 = driver.getWindowHandle();
        System.out.println(ar1);
		//get address of new page
	//	String mainpageid = driver.getWindowHandle();
		//System.out.println(mainpageid);
		//get an address of main page and child browser 
		Set<String> ids = driver.getWindowHandles();
		Thread.sleep(2000);
		System.out.println(ids);
		   ArrayList<String> ar=new ArrayList(ids);
		 System.out.println(ar.size());
		    System.out.println(ar.get(0));
		    System.out.println(ar.get(1));
		    System.out.println(ar.get(2));
		    System.out.println(ar.get(3));
		    
		    
		    		
	}
		
	}


