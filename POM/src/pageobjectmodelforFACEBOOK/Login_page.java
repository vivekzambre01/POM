package pageobjectmodelforFACEBOOK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Login_page {

	     //FIRSTNAME
		@FindBy(xpath="//input[@name='firstname']") private WebElement FIRSTNAME;
		  //LASTNAME
		@FindBy(xpath="//input[@name='lastname']") private WebElement LASTNAME;
		  //MOBNO
		@FindBy(xpath="//input[@id='u_0_s']") private WebElement MOBNO;
		   //PASSWORD
		@FindBy(xpath="(//input[@type='password'])[2]") private WebElement PASSWORD;
		    
		    
		   //DAY
		@FindBy(xpath="//select[@id='day']") private  WebElement DAY;
		       Select s=new Select(DAY);
		       
		   //MONTH
		@FindBy(xpath="//select[@id='month']") private WebElement MONTH;
		       Select s1=new Select(MONTH);
		       
		    //YEAR
		@FindBy(xpath="//select[@id='year']") private WebElement YEAR;
		       Select s2=new Select(YEAR);
		      //select  radio button MALE
		 @FindBy(xpath="(//input[@type='radio'])[2]") private WebElement MALE;
		      //click on SIGNUP
		 @FindBy(xpath="//button[@type='submit']") private WebElement SIGNUP;
		 
		   //create an constructor
		 public Login_page(WebDriver driver) {
			 PageFactory.initElements(driver, this);
		 }
		
		 public void firstname(){
			 FIRSTNAME.sendKeys("vivek");
			 
		 }
		 public void lastname(){
			 LASTNAME.sendKeys("zambre");
		 }
		 public void mobileno() {
			 MOBNO.sendKeys("8600632198");
		 }
		 public void password() {
			 PASSWORD.sendKeys("vivek84835");
		 }
		public void enterday() {
			Select  s=new Select(DAY);
			s.selectByIndex(10);
					
		
		}
		public void  entermonth() {
			Select  s1=new Select(MONTH);
			s1.selectByVisibleText("feb");
			
		}
		public void enteryear() {
			Select s2=new Select(YEAR);
			s2.selectByValue("1997");
		}
		public  void entermale() {
			MALE.click();
		}
		
		public void signup() {
			SIGNUP.click();
		}
		
	}


