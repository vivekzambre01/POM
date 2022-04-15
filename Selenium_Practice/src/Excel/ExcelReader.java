package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public void ReadData() throws IOException
	{
		// to get Path of that Variable let the java know about it
		File src = new File("C:\\Users\\Vivek\\Desktop\\Book1.xlsx");
		
		//to load the File
		FileInputStream fis= new FileInputStream(src);
		
		//load the workbook or excel file
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
	XSSFSheet sh1 = wb.getSheetAt(0);
	
	 String value = sh1.getRow(1).getCell(1).getStringCellValue();
		
	 System.out.println(value);
		
		
		
		
		
	}

}
