package Framework2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitelogin1Page {

       //step 1
	//UN
	@FindBy(xpath="//input[@type='text']") private WebElement UN;
	
	//PWD
	@FindBy(xpath="//input[@placeholder='Password']") private WebElement PWD;
	
	//LOGIN
	@FindBy(xpath="//button[@type='submit']") private WebElement LOGIN;
	
	//create constructor
	public Kitelogin1Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//step3
	//enter UN
	public void setKiteLogin1PageUN(String string) {
		UN.sendKeys(string);
	}
	
	//enter PWD
	public void setKiteLogin1PagePWD(String string) {
		PWD.sendKeys(string);
		
	}
	//click on login button
	public void clickKiteLoginButton() {
		LOGIN.click();
	}

}
	
	
	

