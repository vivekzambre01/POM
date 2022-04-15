package yourproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Table2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\Java\\\\chromedriver.exe");
	//	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("file:///C:/Users/Vivek/Desktop/Table.html");
		String exp="selenium";
		int rowSize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr")).size();
		System.out.println(rowSize);
		for(int i=1;i<=rowSize;i++) {
	  int colSize = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr[\"+i+\"]/td")).size();
	 for(int j=1;j<=colSize;j++)
		 {
     	 String act = driver.findElement(By.xpath("//table[@id='1234']/tbody/tr[\"+i+\"]/td[\"+j+\"]")).getText();
	 System.out.println(act);
		 if(act.equals(exp)) {
			System.out.println("exp result found at row no"+i+"&"+"col no"+j);
			 break;
		 }
		}
		 
		 
		}
		}
	}
