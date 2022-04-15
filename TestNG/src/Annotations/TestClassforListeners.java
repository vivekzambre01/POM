package Annotations;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (TestngListerns.class)
public class TestClassforListeners {

	
	@Test(priority =1)
	public void testCase1()
	{
		Reporter.log("testCase1",true);
	}
	@Test(priority =2)
	public void testCase2()
	{
		Reporter.log("testCase2",true);
	}
	@Test(priority =3)
	public void testCase3()
	{
		Reporter.log("testCase3",true);
		Assert.fail();
		
	}
	@Test(priority =4,dependsOnMethods = "testCase3")
	public void testCase4()
	{
		Reporter.log("testCase4",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
