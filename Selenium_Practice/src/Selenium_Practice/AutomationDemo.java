package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("vivek");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("zambre");
		driver.findElement(By.xpath("//div[@class='col-md-8 col-xs-8 col-sm-8']/textarea")).sendKeys("malkapur");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("www.vivek@callhippo.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8600632198");
		driver.findElement(By.xpath("(//div[@class='col-md-4 col-xs-4 col-sm-4'])[5]//input[@value='Male']"))
		.click();
		driver.findElement(By.xpath("(//div[@class='col-md-4 col-xs-4 col-sm-4'])[6]//input[@value='Cricket']"))
		.click();
		Thread.sleep(3000);
		WebElement vv = driver.findElement(By.xpath("(//div[@class='col-md-4 col-xs-4 col-sm-4'])[7]//div[@id='msdd']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='English'",vv);
		//driver.findElement(By.xpath("//select[@id='Skills']//option[@value='Android']")).click();
		driver.findElement(By.xpath("//*[@id=\"Skills\"]/option[3]")).click();
      ((JavascriptExecutor)driver).executeScript("scroll(0,2000)");
        driver.findElement(By.xpath("//select[@id='countries']//option[@value='Afghanistan']")).click();
     /* driver.findElement(By.xpath("//input[@class='select2-search__field']")).click();
      driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(Keys.ARROW_DOWN);
      driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys(Keys.ENTER);
      */
       driver.findElement(By.xpath("//select[@id='yearbox']//option[@value='1997']")).click(); 
       driver.findElement(By.xpath("//select[@type='text']//option[@value='February']")).click();
       driver.findElement(By.xpath("//select[@type='text']//option[@value='10']")).click();
       driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@860063");
       driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Test@860063");
       //click  to button
       driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
       
       Thread.sleep(5000);
       driver.findElement(By.xpath("//button[@value='Refresh']"))
       .click();
       
	}

}
