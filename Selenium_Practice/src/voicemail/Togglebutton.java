package voicemail;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Togglebutton {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jenkins-app.callhippo.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vivekzambre@callhippo.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
		//driver.switchTo().alert().accept();
       	driver.findElement(By.xpath("//button[@type='button']")).click();	
       	Thread.sleep(5000);
       	driver.findElement(By.xpath("//div[@class='ant-layout-sider-children']//ul//li[2]/a")).click();
       	Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[@class='settingcircle']//i)[1]")).click();
        Thread.sleep(2000);
//         
//         Actions  act= new Actions(driver);
//        act.moveToElement(driver.findElement(By.xpath("//*[@id=\"VoiceMailPosition\"]/div/div/div[1]/button"))).perform();
//        
//     By button = By.xpath("//div[@id='VoiceMailPosition']/div/div/div/button[@type='button']");
//      // button.click();
//     WebElement btn = driver.findElement(By.xpath("//div[@id='VoiceMailPosition']/div/div/div/button[@type='button']"));
//      String on = driver.findElement(button).getAttribute("class");
//      String off = driver.findElement(button).getAttribute("class");
                Togglebutton bn= new Togglebutton();
                 bn.method("on");
      
	}
	public void method(String btn)
	{
	     By button = By.xpath("//div[@id='VoiceMailPosition']/div/div/div/button[@type='button']");
       driver.findElement(By.xpath("//div[@id='VoiceMailPosition']/div/div/div/button[@type='button']")).sendKeys(btn);
       

		 String on = driver.findElement(button).getAttribute("class");
	   String  off=  driver.findElement(button).getAttribute("class");
	   
	   
		   if(off.equals("ant-switch"))
		      {
		    	// btn.click();
		    	 }
		      else if(on.equals("ant-switch ant-switch-checked"))
		      {
		    	 System.out.println("button is already on");
		    
		      }
	}
     
   
      }
	


