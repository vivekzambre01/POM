package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		
		Sample s= new Sample();
		s.method1();
		
	}
		public void method1() throws EncryptedDocumentException, IOException
		{
			FileInputStream file= new FileInputStream("C:\\Users\\Vivek\\Desktop\\Book1.xlsx");
			
		        String gh = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		       
		       System.out.println(gh);
		
		}
		

	}


