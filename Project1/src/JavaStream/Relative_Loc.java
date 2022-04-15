package JavaStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.locators.RelativeLocator;

		@BeforeTest
		public  void setUp() {
			System.setProperty("webdriver.chrome.driver","C:\\Broswers\\Chrome\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/angularpractice/");
			driver.manage().window().maximize();
		}
		@Test
		{
			WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
			
			driver.findElement(with(By.tagName("label")
		}
	
		@AfterTest
      public void close()
      {
			
			
	   }

}
