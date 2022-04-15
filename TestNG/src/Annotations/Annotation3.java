package Annotations;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Annotation3 {

	@Test(priority = 1)
	public void Test1()
	{
		Reporter.log("Testcase1",true);
		
	}
	@Test(priority = 2)
	public void Test2()
	{
		Reporter.log("Testcase2",true);
	
		
	}
	@Test(priority = 3)
	public void Test3()
	{
		Reporter.log("Testcase3",true);
		System.out.println("Test Case 3");
		
	}
	@Test(priority = 4)
	public void Test4()
	{
		Reporter.log("Testcase4",true);
		//System.out.println("Test Case 4");
		Assert.fail();
		
	}
	
	
	
	
	
	
	
	
}
