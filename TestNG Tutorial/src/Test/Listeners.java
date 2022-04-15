package Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	
	@Override
	public void onTestStart(ITestResult result) {
		
		
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I Successfully clear HDFC Bank Loan");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("I am not able to clear Icici bank loan");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
		
	}


	
	
	
	
	
	

}
