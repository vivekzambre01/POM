package CRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Crm1 {

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
	driver.findElement(By.xpath("//input[@name='cust_17309']")).sendKeys("VIVEK");
	driver.findElement(By.xpath("//input[@name='cust_17310']")).sendKeys("HGHGFHG");
	driver.findElement(By.xpath("//input[@name='cust_17324']")).sendKeys("6757654");
	driver.findElement(By.xpath("//input[@name='cust_17336']")).sendKeys("6556465");
	WebDriverWait wait = new WebDriverWait(driver,30);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("scroll(0, 500)");
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='flex-item section-column-conainer']//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//a[1]//i[1]"))).click();
	
	driver.findElement(By.xpath("//div[@value='165']")).click();
	driver.findElement(By.xpath("//span[normalize-space()='Save and proceed']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//i[@class='icon icon-stack']")).click();
	driver.findElement(By.xpath("//*[@id=\"newobject\"]/div[5]/a[1]/span[2]")).click();
	}

	}


