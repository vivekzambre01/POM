package Framework2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility 
{
	  
	
	public static void CaptureScreenshot(WebDriver driver) throws IOException {
     File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     File dest=new File("C:\\Users\\Vivek\\eclipse-workspace\\POM\\screenshot\\img2.jpg");
     FileHandler.copy(src, dest);
	}
	public static String getTextData(int row,int cell) throws EncryptedDocumentException, IOException 
	{
	    FileInputStream file =new FileInputStream("C:\\Users\\Vivek\\eclipse-workspace\\POM\\Drivers\\sheet1.xlsx");
		Sheet sheetvalue = WorkbookFactory.create(file).getSheet("sheet1");
		String value = sheetvalue.getRow(row).getCell(cell).getStringCellValue();
		
		return value;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
