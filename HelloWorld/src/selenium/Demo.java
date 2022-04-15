package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
     driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();

    driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
     driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
     driver.findElement(By.xpath("//input[@type='text']")).click();
   WebElement dj = driver.findElement(By.xpath("//div[@class='_4rbf _53ij']"));
       boolean vj = dj.isDisplayed();
       System.out.println(vj);
       
     //  String exp = "The email address and phone number that you've entered doesn't match any account. sign up for an account";
       // WebElement act = driver.findElement(By.xpath("//div[@class='_4rbf _53ij']"));
         
        
	}

}
