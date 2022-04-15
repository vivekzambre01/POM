package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample_5 {
    public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file =new FileInputStream("C:\\Users\\Vivek\\Documents\\Sheet1.xlsx");
		int irn = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();
		System.out.println(irn);
		for(int i=0;i<=irn;i++) {
			FileInputStream file1=new FileInputStream("C:\\Users\\Vivek\\Documents\\Sheet1.xlsx");
			     short icn = WorkbookFactory.create(file1).getSheet("Sheet1").getRow(i).getLastCellNum();
		for(int j=0;j<=icn-1;j++) {
			FileInputStream file2=new FileInputStream("C:\\Users\\Vivek\\Documents\\Sheet1.xlsx");
			      Sheet sheet1 = WorkbookFactory.create(file2).getSheet("Sheet1");
			                 CellType cell = sheet1.getRow(i).getCell(j).getCellType();
			        if(cell==cell.STRING) {
			        	System.out.println(sheet1.getRow(i).getCell(j).getStringCellValue()+" ");
			        }else
			        {
			        	System.out.println(sheet1.getRow(i).getCell(j).getNumericCellValue()+" ");
			        }
			                 
		}System.out.println();
		
		}
		
		
		
	}

	}

