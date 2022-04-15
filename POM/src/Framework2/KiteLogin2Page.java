package Framework2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin2Page {

	@FindBy(xpath="//input[@type='password']") private WebElement pin;
	
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement cnt;
	
	
	//create constructor
	public KiteLogin2Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setKiteLogin2Pagepin(String string) {
		 pin.sendKeys(string);
		
	}
	
     public void clickKiteLogin2Pagecontinue() 
     {
         cnt.click();	 
     }

	
	}

	
     
     
