package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDataConfig {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Broswers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		File fis= new File("C:\\Users\\Vivek\\Desktop\\Book1.xlsx");
		
		 FileInputStream file= new FileInputStream(fis);
	  
	  XSSFWorkbook xw= new XSSFWorkbook(file);
	   XSSFSheet sheet1 = xw.getSheetAt(0);
	      sheet1.getRow(0).createCell(2).setCellValue("sdad");
	      sheet1.getRow(1).createCell(2).setCellValue("fgdgfd");
	      sheet1.getRow(2).createCell(2).setCellValue("hghgh");
	      sheet1.getRow(3).createCell(2).setCellValue("ghfhgf");
	   
	      FileOutputStream fout= new FileOutputStream(fis);
	      xw.write(fout);
	      xw.close();

	}

}
