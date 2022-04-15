package Excel_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	
		public static String readdata(int row,int coloum) throws IOException
		{
			
		File src= new File("C:\\Book1.xlsx");
		//to load file
		FileInputStream fis= new FileInputStream(src);
		//load workbook or excel sheet
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		//to  get sheet from workbook
		XSSFSheet sh1= wb.getSheetAt(0);
	 String value = sh1.getRow(row).getCell(coloum).getStringCellValue();
		
		System.out.println(value);
				return value;
		}
		
		public static void writedata() throws IOException
		{
			File src= new File("C:\\Book1.xlsx");
			FileInputStream fis= new FileInputStream(src);
			//load the workbook or excel sheet
			XSSFWorkbook wb= new XSSFWorkbook(fis);
			//to get sheet from workbook
			XSSFSheet sh1=wb.getSheetAt(0);
			
			File fout= new File("C:\\Book1.xlsx");
		
			FileOutputStream fo= new FileOutputStream(fout);
			
			sh1.createRow(5).createCell(5).setCellValue("tushar");
			wb.write(fo);
		}		
		
}
