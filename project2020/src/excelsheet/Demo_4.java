package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
     FileInputStream file=new FileInputStream("C:\\Users\\Vivek\\Documents\\Sheet1.xlsx");
           Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
                  int lastrownum = sh.getLastRowNum();
                  System.out.println(lastrownum);
                   short lastcellnum = sh.getRow(1).getLastCellNum();
                  System.out.println(lastcellnum);  
		
		
		
	}

}
