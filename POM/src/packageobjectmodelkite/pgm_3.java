package packageobjectmodelkite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class pgm_3 {
    @Test
	public void sample() {
		String str = "hello";
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(str,"hello");
		Reporter.log(str,true);
	
		String str1="hii";
		soft.assertEquals(str1, "hi");
		Reporter.log(str1,true);
		
		soft.assertAll();
	}
		}
	
	
	
	

