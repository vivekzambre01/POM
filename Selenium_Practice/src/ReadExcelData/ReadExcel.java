package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	
	public static void main(String[] args) throws IOException {
		
		
		File Fis= new File("C:\\Users\\Vivek\\Desktop\\Book1.xlsx");
		
		FileInputStream file= new FileInputStream(Fis);
		//class coming from apachi poi this class is loaded toatl workbook
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Data from console"+data0);
		 
		String data1 = sheet1.getRow(2).getCell(2).getStringCellValue();
		
		System.out.println("Data from console"+data0);
		wb.close();
		 int rowcount = sheet1.getLastRowNum();
		 System.out.println("Total rows is "+rowcount);
		 
		 for(int i=0;i<rowcount;i++)
		 {
			String data2 = sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println(data2);
		 }
		wb.close();
	}
}
