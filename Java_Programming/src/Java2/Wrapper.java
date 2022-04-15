package Java2;

public class Wrapper {

	public static void main(String[] args) {

		int a = 100;

		System.out.println(a); // primitive data type
		Integer b = 200;

		System.out.println(b); // Wrapper
		Test();

		
		//System.out.println(price1 + price2);

		
	}

	public static void Test() {
		String price1 = "463";
		String price2 = "237";
		int p1 = Integer.parseInt(price1);
		int p2 = Integer.parseInt(price2);
		
		int sum = p1 + p2;

		System.out.println(sum);
		if (sum == 700) {
			System.out.println("passed");
		} else {
			System.out.println("Failed");

		}

	}

}
