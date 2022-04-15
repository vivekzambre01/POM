package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromedriver {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
      driver.get("https://www.google.com/");
     driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("iphone");
     Thread.sleep(2000);
   
   String exp="iphone se";
         for (WebElement element : option) {
    	  String act=element.getText();
    	   System.out.println(act);
   	     if(act.equalsIgnoreCase(exp)) {
    		   element.click();
  	 	   System.out.println(element);
    	   }

