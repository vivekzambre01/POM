package Annotations;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestngListerns.class)

public class TestCaseWithScreenShot extends TestNGpractice{
	@Test(priority =1)
	public void testCase1()
	{
		Reporter.log("testCase1",true);
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("mobile");
		Assert.assertEquals(true, false);	
	}
	
	
}
