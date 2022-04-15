package packageobjectmodelkite;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class pgm_1 {
     @Test
	public void assertequals() 
	{
		String act="hii";
		String exp="hi";
		String a="hello";
		String b="hello";
		
		Assert.assertEquals(a,b);
	    Assert.assertEquals(act, exp);
	}
		 @Test
			public void assertTrue() 
			{
			    boolean act = false;
			    Assert.assertTrue(act,"result are matched");
			 System.out.println(act);
			}
		 @Test
		 public void assertfalse() 
		 {
			 boolean act = false;
			 Assert.assertFalse(act,"result are matched");
			 System.out.println(act);
		 }
			}

	
