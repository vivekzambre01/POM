package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		
		Properties prop= new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Vivek\\eclipse-workspace\\TestNG Tutorial\\src\\Test\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("URL"));
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Vivek\\eclipse-workspace\\TestNG Tutorial\\src\\Test\\data.properties");
		
		  prop.setProperty("browser","firefox");
		  System.out.println(prop.getProperty("browser"));
		  prop.store(fos, null);
	}

}
