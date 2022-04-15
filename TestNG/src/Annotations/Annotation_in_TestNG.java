package Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_in_TestNG {

	@BeforeClass
	public void beforeclassmethod()
	{
		System.out.println("Before class execuated");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		//Reporter.log("Before class",true);
		System.out.println("before method is execuated");
	}
	@Test
	public void case1()
	{
		//Reporter.log("test case 1",true);
		System.out.println("Test case 1 is Running");
	}
	@Test
	public  void case2()
	{
		//Reporter.log("test case 2",true);
		System.out.println("Test case 2 is Running");
	}
	@AfterMethod
	public void Aftermethod()
	{
		//Reporter.log("After class",true);
		System.out.println("After method is execuated");
	}
	@AfterClass
	public void Afterclassmethod()
	{
		//Reporter.log("After class method",true);
		System.out.println("After class execuating");
	}
	
	
	
	
	
	
}
