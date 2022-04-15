package Test;

import org.testng.annotations.Test;

public class Day2 {

	@Test(groups={"Smoke"})
	public void Thirdtest()
	{
		System.out.println("send  Test smoke");
	}
	@Test(groups={"Smoke"})
	public void fourthtest()
	{
		System.out.println("Fourth Test smoke");
	}
	@org.testng.annotations.BeforeClass
	public void BeforeClass()
	{
		System.out.println("I will Execuate Before Class");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		System.out.println("I will Execuate AfterClass");
	}
}
