package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file=new FileInputStream("C:\\Users\\Vivek\\Documents\\Sheet1.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		    for(int i=0;i<=4;i++)
		    {
		    	   Cell cellvalue = sh.getRow(4).getCell(i);
		    	   if(cellvalue.getCellType()==CellType.STRING)
		    	   {
		    		   System.out.println(cellvalue.getStringCellValue()+" ");
		    	   }else
		    	   {
		    		   System.out.println(cellvalue.getNumericCellValue()+" ");
		    	   }
		    	    
		    }
		
		
		
		
	}

}
