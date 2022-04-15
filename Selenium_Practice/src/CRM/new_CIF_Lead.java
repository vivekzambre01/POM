package CRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class new_CIF_Lead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://knb.crmnext.com/g7/app/login/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"TxtName\"]")).sendKeys("Branchofficer");
	    driver.findElement(By.xpath("//*[@id=\"TxtPassword\"]")).sendKeys("acid_qa");
    	driver.findElement(By.xpath("//*[@id=\"registration\"]/input")).click();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement Lead = driver.findElement(By.xpath("//li[@class='side-nav-list__item']/div/div/a/i[@class='icon icon-sales']"));
	Actions act= new Actions(driver);
	  act.moveToElement(Lead).build().perform();
	  
	driver.get("http://knb.crmnext.com/g7/app/CRMNextObject/Home/Lead");
	driver.findElement(By.xpath("//*[@id=\"home-page\"]/div[1]/div/div[2]/div[1]/div/a/span")).click();
	WebElement CustomerT = driver.findElement(By.xpath("//select[@name='cust_17307']"));
	Select CT = new Select(CustomerT);
	CT.selectByIndex(1);
	driver.findElement(By.xpath("//*[@id=\"newobject\"]/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[1]/div/div/div/input")).sendKeys("");//
	
    driver.findElement(By.xpath("//*[@id=\"newobject\"]/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div[1]/div[2]/div/div/div/input")).sendKeys("HHGJHG");
	WebElement IDNO = driver.findElement(By.xpath("(//input[@class='textbox field__item'])[3]"));
	IDNO.sendKeys("656546");
	driver.findElement(By.xpath("//*[@id=\"newobject\"]/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div/input")).sendKeys("54651321654");
	
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div/div/span/div")).click();
	

	}

}
