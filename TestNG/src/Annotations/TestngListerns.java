package Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import Utility.Utility;
import Utility.screenshot;

public class TestngListerns extends TestNGpractice implements ITestListener
{
	public void onStart(ITestContext result) {
		System.out.println("starting of test case:-"+result.getName());
		
	}
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Starting of TESTCASE:="+result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("success of test case:-"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("failure of test case:-"+result.getName());
		try {
			screenshot.capturescreenshot(driver, result.getName());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("finish of test case:-"+context.getName());
	}
	
	public void onTestSkipped(ITestResult result) {
	
		System.out.println("skipped of test case:-"+result.getName());

	}
}

