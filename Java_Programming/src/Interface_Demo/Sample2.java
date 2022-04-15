package Interface_Demo;

public class Sample2 implements Sample {

	public static void main(String[] args) {
		
		Sample s1 = new Sample2();
		
		System.out.println(s1.add(10, 20));
		System.out.println(s1.sub(10, 20));
		System.out.println(s1.multiplication(20, 20));
		System.out.println(s1.division(10, 20));
		
		
}

	
	public int sub(int a, int b) {
		
		int sub=a-b;
		return sub;
	}

	
	public int add(int a, int b) {
		int sum=a+b;
		return sum;
	}

	
	public int multiplication(int a, int b) {
		
		int multi=a*b;
		return multi;
	}

	
	public int division(int a, int  b) {
		
		int division =a/b;
		return division;
	}

	
	
}