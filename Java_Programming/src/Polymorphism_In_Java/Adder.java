package Polymorphism_In_Java;

public class Adder {
	
	public static void main(String[] args) {
		
		//Adder ad= new Adder();
		System.out.println(Adder.add(10, 20));
		System.out.println(Adder.add(10.2, 20));
		
	}
	
	static int add(int a, int b)
	{
		return a+b;
	}
	static double add(double a, double b)
	{
		return a+b;
	}
	
}

