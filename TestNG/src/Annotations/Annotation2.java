package Annotations;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation2 {

	
  @Test(priority =1)
  public void testcase1()
  {
	  Reporter.log("TC1",true);
	
  }
  @Test(priority =2)
  public void testcase2()
  {
	 Reporter.log("TC2", true); 
	  
  }
  @Test(priority = -1)
  public void extramethod()
  {
	  Reporter.log("Extra Method as a Test Case",true);
  } 
  @Test(priority = 4)
  public void testcase3()
  {
	  Reporter.log("TC3 from test 3",true);
  }
  @Test(enabled = false)
  public void testcase5()
  {
	  Reporter.log("TC3 from test5",true);
  }
  @Test(priority = -4)
  public void testcase6()
  {
	  Reporter.log("TC6 From test2",true);
  }
  
  
  
  
  
  
  
  
  
  
  
  
}
