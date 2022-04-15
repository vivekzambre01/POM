package Test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {

	@Parameters({"URL","API/KAY"})
	@Test
     public void FirstTest(String name, String ss)
     {
    	 
    	 
    	 System.out.println("TEST1");
    	 System.out.println(name);
    	 System.out.println(ss);
     }

	@org.testng.annotations.BeforeClass
	public void BeforeClass()
	{
		System.out.println("I will Execuate BeforeClass");
	}
    @org.testng.annotations.AfterClass
	public void AfterClass()
	{
		System.out.println("I will Execuate AfterClass");
	}
	@Test(dataProvider="getData")
	public void Test(String username , String Password)
	{
		System.out.println(username);
		System.out.println(Password);
	}
	@DataProvider
	public Object[][] getData()
	{
		// 1 st combination testing with one username & Password
		// 2nd Username & History
		Object [][] data = new Object[3][2];
		data[0][0]  = "Firstname";
		data[0][1]  = "firstPassword";
		//columns are nothing but the value in that perticular row
		//2 nd Set
		data[1][0] = "secondName";
		data[1][1] = "Secondpassword";
		//3 rd set
		data[2][0] = "ThirdName";
		data[2][1] = "thirdpassword";
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
