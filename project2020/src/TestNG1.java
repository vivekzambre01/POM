import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test(priority=1)
	public void test1() {
		System.out.println("running Test1");
	}
	@Test(priority=2)
	public void loginin() {
		//Assert.fail();
		System.out.println("login to app");
		}
     //4.timeout
	@Test(timeOut = 5000)
	public void Test2() throws InterruptedException
	{   Thread.sleep(3000);
		System.out.println("running to an test2");
	}
	@Test()
	public void Test3()  {
	
		System.out.println("running to an test3");
	}
	

}
