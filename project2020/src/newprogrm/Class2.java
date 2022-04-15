package newprogrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.google.com/");
     WebElement source = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
         source.sendKeys("iphone se");
       List<WebElement> option = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
       System.out.println(option.size());
        String exp = "iphone se";
        for (WebElement element : option) {
			String act = element.getText();
		//	String act1 = element.getTagName();
			System.out.println(act);
		//	System.out.println(act1);
			if(act.equalsIgnoreCase(exp)) {
				element.click();
				System.out.println(element);
			}
			
		}
        
         
        		 
		

	}

}
