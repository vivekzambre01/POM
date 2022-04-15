package Test;

import org.testng.annotations.Test;

public class Day3 {

	@Test
    public void weblogin()
   {
	System.out.println("weblogin");
	
  }
	@Test
    public void mobilelogin()
    {
    	System.out.println("mobilelogin");	
    }
	@Test
	public void webAPILogin()
	{
		System.out.println("webAPILogin");
	}
	@org.testng.annotations.BeforeTest()
	public void BeforeTest()
	{
		System.out.println("BeforeTest321");
	}
	@org.testng.annotations.AfterTest()
	public void AfterTest()
	{
		System.out.println("AfterTest123");
	}
	@org.testng.annotations.BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("I will Execuate BeforeMethod in Day 3 Class");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod()
	{
		System.out.println("I will Execuate AfterMethod in Day 3 Class");
	}
	
	
	
	
	
	
	
}
