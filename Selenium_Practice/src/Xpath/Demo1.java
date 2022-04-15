package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("vivek"+ " ");
	driver.findElement(By.xpath("//input[@type='text' and @id='first_name']")).sendKeys("dhananjay");
//		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("vivek");
	driver.findElement(By.xpath("//input[starts-with(@id,'la')]")).sendKeys("zambre");
	 WebElement email = driver.findElement(By.xpath("//input[contains(@id,'email')]"));
	 email.sendKeys("vivekzambre999@gmail.com");
	String viv = email.getText();
	System.out.println(viv);
	Thread.sleep(3000);
	 WebElement link = driver.findElement(By.linkText("Terms of Use"));
	 link.click();
	 link.getText();
	
	
	 if(link.isSelected())
	 {
		System.out.println("link is selected"); 
	 }
	 else
	 {
		 System.out.println("Link is not selected");
	 }
	
		
	}

}
