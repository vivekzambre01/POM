package selenium;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Chrome {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\New folder\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("http://www.facebook.com/");
           WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
           Select s1=new Select(day);
           s1.selectByIndex(10);
            List<WebElement> aaa = s1.getOptions();
           for (WebElement element : aaa) {
        	   System.out.println(element.getText());
			
		}
           
           Thread.sleep(3000);
           
     WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
         Select s=new Select(month);
             List<WebElement> allelement = s.getOptions();
                 for (WebElement ele : allelement) {
                	System.out.println(ele.getText());
              }
                 
                 
                 
         
    
                              

	}

}
