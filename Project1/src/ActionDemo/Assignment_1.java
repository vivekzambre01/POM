package ActionDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	     driver.manage().window().maximize();
	   WebElement checkbox = driver.findElement(By.xpath("//input[@id='checkBoxOption2']"));
	     
	   checkbox.click();
	   System.out.println(checkbox.getText());
	 Select option =new Select(driver.findElement(By.id("dropdown-class-example")));
	 option.selectByVisibleText("Option2");
	 
	String option2=driver.findElement(By.xpath("(//div[@id='checkbox-example']//label)[2]")).getText();
	   
	 driver.findElement(By.xpath("//input[@id='name']")).sendKeys(option2);
	 WebElement alert = driver.findElement(By.xpath("//input[@id='alertbtn']"));
	 alert.click();
	 Thread.sleep(2000);
	String al = alert.getText();
	System.out.println(al);
	Thread.sleep(3000);
	driver.close();
	
	 
	   
	   

	}

}
