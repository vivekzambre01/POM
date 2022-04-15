package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class KiteHomePage {

	@FindBy(xpath="//span[text()='KV']") private WebElement profilename;
	
	//create constructor
	public KiteHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//@Test(expectedExceptions ="InvalidSelectorException.class")
	public void verifyKiteHomePageName() {
		String act=profilename.getText();
		String exp="KV";
		
		if(act.equals(exp)) {
			System.out.println("pass");
		}else
		{
			System.out.println("fail");
		}
		
		
		
		}
	
}
