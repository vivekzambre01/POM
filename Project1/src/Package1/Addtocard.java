package Package1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocard {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		String [] itemneeded = {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	     additems(driver,itemneeded);
	     driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	     driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
	     driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
     
		
	}
	public static void additems(WebDriver driver,String []itemneeded)
	
	{
		int j=0;
List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for (int i=0;i<products.size();i++)
		{
			  
		  String[] name = products.get(i).getText().split("-");
		  String formatedname = name[0].trim();  
		  
		List itemneededlist = Arrays.asList(itemneeded);
		  
		  if(itemneededlist.contains(formatedname))
		  {
			  j++;
			 driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			  if(j==3)
			  {
				  break;
			  }
		  }
		}
		
	}
}