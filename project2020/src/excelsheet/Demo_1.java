package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
      FileInputStream file=new FileInputStream("C:\\Users\\Vivek\\Documents\\Sheet1.xlsx");
           Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
                      CellType ctype = sh.getRow(1).getCell(1).getCellType();
                      System.out.println(ctype);
               if(ctype==CellType.STRING) {
            	   System.out.println("running get string cell value number");
                    String value = sh.getRow(1).getCell(1).getStringCellValue();
                    System.out.println(value);
               }else 
               {
            	  System.out.println("running get numeric cell value"); 
            	    }
                double value = sh.getRow(1).getCell(0).getNumericCellValue();
                     System.out.println(value);
      
      
	}

}
