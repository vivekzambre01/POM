package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
     FileInputStream file=new FileInputStream("C:\\Users\\Vivek\\Documents\\Sheet1.xlsx");
        Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
          Cell cellvalue = sh.getRow(3).getCell(1);
          if(cellvalue.getCellType()==CellType.STRING) {
        	   String value = cellvalue.getStringCellValue();
        	   System.out.println(value+" vivek");
          }else
          {
        	   double value = cellvalue.getNumericCellValue();
        	   System.out.println(value);
          }
              
		
		
		
		
	}

}
