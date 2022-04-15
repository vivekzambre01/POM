package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4 {
	
	
	
    @Test(priority = 1)
	public void HDFCLoan()
	{
		System.out.println("HDFC LOAN");
		Assert.assertTrue(false);
	}
    @Test(priority = 2)
    public void Iciciloan()
    {
    	System.out.println("IciciLoan");
    	Assert.assertTrue(true);
    }
   
}
