package TestNG;

import org.testng.annotations.Test;

public class demo2 {
	@Test(priority = 1)
public void tc7() {
		System.out.println("running test case7");
	}
	@Test(priority = 3)
	public void tc8() {
		System.out.println("running test case8");
	}
    @Test(priority = 2)
	public void tc9() {
		System.out.println("running test case9");
	}
    @Test(priority = 4)
	public void tc10() {
		System.out.println("running test case 10");
	}
	
}
