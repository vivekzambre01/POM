package Annotations;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {

	
	@BeforeSuite
	public void beforesuitemethod()
	{
		System.out.println("Before Suite method is execuated");
	}
	@BeforeTest
	public void BeforeTestmethod()
	{
		System.out.println("Before Test Mehod Execuated");
	}
	@BeforeClass
	public void BeforeClassMethod()
	{
		System.out.println("Before Class Method is Execuated");
	}
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before Method is Execuated");
	}
	@Test
	public void Testmethod1()
	{
		System.out.println("Test Method1 is Execuated");
	}
	@Test
	public void Testmethod2()
	{
		System.out.println("Test Method2 is Execuated");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method is Execuated");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("After class is Execuated");
	}
	@AfterTest
	public void aftertest()
	{
		System.out.println("After test method is execuated");
	}
	@AfterSuite
	public void aftesuite()
	{
		System.out.println("After suite method is execuated");
	}
	
	

}
