package Annotations;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Annotation4 {

	
	@Test(priority = 1)
	public void TestCase1()
	{
		Reporter.log("TC1",true);	
	}
	@Test(priority = 2)
	public void TestCase2()
	{
	Reporter.log("TC2",false);	
	Assert.fail();
		
	}
	@Test(priority =3,dependsOnMethods = "TestCase2")
	public void TestCase3()
	{
		Reporter.log("TC3",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
