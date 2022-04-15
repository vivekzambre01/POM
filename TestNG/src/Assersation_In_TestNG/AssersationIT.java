package Assersation_In_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssersationIT {

	@Test
	public void testcase1()
	{
		Assert.fail();
	}
	@Test
	public void testcase2()
	{
		System.out.println("hhgjh");
		Assert.assertEquals(true,false,"both condition are not same");
		System.out.println("vivek");
	}
	@Test
	public void testcase3()
	{
		Assert.assertEquals(true,true,"both condition are not same");
		System.out.println("Ritesh");
		System.out.println("Tushar");
	}
	
	
	
	
	
	
	
	
	
}
