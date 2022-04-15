package Package1;

import java.util.concurrent.PriorityBlockingQueue;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleDemo {

	@Test(priority = 1)
	public void method1()
	{
		Reporter.log("vivek zambre",true);
		Reporter.log("Ritesh",true);
		Assert.assertEquals(12,13);
		 System.out.println("method 1 is Running");
	}
	@Test(priority = 1)
	public void method2()
	{
		System.out.println("method 2 is Running");
	}
	
	@Test(priority = 1)
	public void method3()
	{
		
		System.out.println("method 3 is Running");
	}
	
	@Test(priority = 1)
	public void method4()
	{
	System.out.println("extra method");	
	}
	
	@Test(invocationCount = 5)
	public void method5()
	{
		Reporter.log("shahu",true);
	System.out.println("extra method");	
	}
	
	@Test(enabled =false)
	public void method7()
	{
	System.out.println("extra method");	
	}
	
	@Test(enabled  =false)
	public void method6()
	{
	System.out.println("extra method");	
	}
}
