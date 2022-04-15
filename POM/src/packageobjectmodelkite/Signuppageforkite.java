package packageobjectmodelkite;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Signuppageforkite {
	@Test(priority=1,description="login  page varifiction")
	public void loginpage() 
	{
		System.out.println("loginpage should  be verify successfuly");
		Reporter.log("login page",true);
		
	}
     @Test(priority=2,description="logout page varification")
	public void logoutpage() 
	{
		System.out.println("logout page ");
	}
}
