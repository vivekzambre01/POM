package Annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groping_Of_TestCases {

	@Test(groups = "Regression")
	public void testcase1()
	{
		Reporter.log("TC1 from Test1",true);
	}

	@Test(groups = "Sanity")
	public void testcase2()
	{
		Reporter.log("TC1 from Test2",true);
	}

	@Test(groups ="Regression")
	public void testcase3()
	{
		Reporter.log("TC1 from Test3",true);
	}

	@Test(groups = {"Regression","Sanity"})
	public void testcase4()
	{
		Reporter.log("TC4 from Test4",true);
	}
	@Test
	public void testcase5()
	{
		Reporter.log("TC5 from Test4",true);
	}
	@Test
	public void TestCase6()
	{
		Reporter.log("TC6 from TestCase6",true);
	}
	
}
