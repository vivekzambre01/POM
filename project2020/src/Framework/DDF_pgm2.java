package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDF_pgm2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
     System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
    FileInputStream file =new FileInputStream("C:\\Users\\Vivek\\Documents\\Book1.xlsx");
       Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
     String fname = sheet.getRow(0).getCell(0).getStringCellValue();
           driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(fname);
           
          String lname = sheet.getRow(0).getCell(1).getStringCellValue();
            WebElement var = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
            var.sendKeys(lname);
             String mobno = sheet.getRow(0).getCell(2).getStringCellValue();   
             driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(mobno);
                String password = sheet.getRow(0).getCell(3).getStringCellValue();
		            driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(password);
		          String day = sheet.getRow(0).getCell(4).getStringCellValue();
		                        driver.findElement(By.xpath("//select[@id='day']")).sendKeys(day);
		         String month = sheet.getRow(0).getCell(5).getStringCellValue();
		         driver.findElement(By.xpath("//select[@id='month']")).sendKeys(month);
		         String year = sheet.getRow(0).getCell(6).getStringCellValue();
		        driver.findElement(By.xpath("//select[@id='year']")).sendKeys(year);
		        String male = sheet.getRow(0).getCell(7).getStringCellValue();
		        if(male.equals("female")) {
		        	driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
		        }else
		        {
		        	driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
		        }
		      driver.findElement(By.xpath("//button[@id='u_0_13']")).click();
		      Thread.sleep(3000);
		
		  String act = driver.findElement(By.xpath("//div[@id='reg_error_inner']")).getText();
		  String exp = "Your password must be at least 6 characters long. Please try another.";
		           System.out.println(exp);
		           System.out.println(act);
		  if(exp.equalsIgnoreCase(act)) {
			  System.out.println("tc pass");
		  }else
			  System.out.println("tc fail");
		  
	
		  
		  
		  
		  
		  
		  
		  
	}
	
	
	
	
	
	
	
	

}
