package Drag_and_Drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_B {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement Fname = driver.findElement(By.xpath("//input[@type='text']"));
		Fname.sendKeys("vivek");
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		
		WebElement Name = driver.findElement(By.xpath("//input[@type='text']"));
		Fname.sendKeys("Ritesh");

	}

}
