import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	
	 @BeforeMethod
	    public void login() {
	    	System.out.println("login to an app");
	    }
		@Test
		public void first() 
		{
			System.out.println("login to app");
		}
	    
		@AfterMethod
		public void applogout()
		{
			System.out.println("logout to an app");
		}
		//3. priority
		@Test(priority=2)
		public void test1()
		{
			System.out.println("running test 1");
		}
		@Test(priority=1)
		public void test2()
		{
			System.out.println("running test 2");
		}
		//2. enabled=false
		@Test(enabled=false)
		public void test4()
		{
			System.out.println("running test 3");
		}
		@Test()
		public void test5()
		{
			System.out.println("running test 5");
		}
		//1.invocation count 
		@Test(invocationCount = 3)
		public void testinvocation() 
		{
			System.out.println("running  invocation count");
		}
		
		
		
		
		
	   
	

}
