package packageobjectmodelkite;

import org.testng.Assert;
import org.testng.annotations.Test;

public class pgm_2 {
	
	 @Test(priority=1)
		public void assertTrue() 
		{
		   boolean a = true;
		   Assert.assertTrue(a,"result are matched1");
		   System.out.println(a);
		}
	 @Test(priority=2)
	 public void assertfalse() 
	 {
		 boolean b = false;
		 Assert.assertTrue(b, "result are matched2");
		 System.out.println(b);
	 }


}
