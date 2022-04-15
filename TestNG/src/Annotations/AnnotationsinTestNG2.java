package Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsinTestNG2 {

	

	@BeforeMethod
	public void beforemethod()
	{
	
		System.out.println("before method is execuated");
	}
	@Test
	public void case3()
	{
		Reporter.log("Test case 3",true);
		System.out.println("Test case 3 is Running");
	}
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("After method is execuated");
	}
	
}
