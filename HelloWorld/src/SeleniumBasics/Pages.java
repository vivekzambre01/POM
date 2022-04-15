package SeleniumBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pages {

	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver\\chromedriver.exe");
		Properties prop= new Properties();
		File src= new File("C:\\Users\\Vivek\\Desktop\\Book1.xlsx");
		//to load the file
		FileInputStream fis = new FileInputStream(src);
		//load the workbook or excel sheet
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		//to get the sheet from workbook
	  XSSFSheet sh1 = wb.getSheetAt(0);
	 	String value = sh1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		System.out.println(value);
			sh1.createRow(5).createCell(1).setCellValue("fifthyen row");
		 
	}
   public static void writedata() throws IOException
   {
	  File src= new File("C:\\Users\\Vivek\\Desktop\\Book1.xlsx");
	  //to load the  File
	  FileInputStream fis = new FileInputStream(src);
	  //load the workbook or Excel sheet
	  XSSFWorkbook wb= new XSSFWorkbook(fis);
	  //to get the sheetfrom workbook
	 XSSFSheet sh1 = wb.getSheetAt(0);
	 
	 File fileout= new File("C:\\Users\\Vivek\\Desktop\\Book1.xlsx");
	 FileOutputStream fout= new FileOutputStream(fileout);
	 sh1.createRow(5).createCell(2).setCellValue("Fifty five");
	 wb.write(fout);
	   
	   
   }
}
