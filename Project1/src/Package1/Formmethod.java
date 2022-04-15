package Package1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget activeWidget']/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='hsw_autocomplePopup autoSuggestPlugin ']/div/input")).sendKeys("Kolkata");
       
		List<WebElement> dynamicList = driver.findElements(By.cssSelector("p[@class='font14 appendBottom5 blackText']"));
	for(int i=0;i<dynamicList.size();i++)
	{
		String text = dynamicList.get(i).getText();
		System.out.println("Text is "+text);
		if (text.contains("Kolkata, India"))
		{
			dynamicList.get(i).click();
			break;
		}
	}
			

}

}