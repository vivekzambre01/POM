package Polymorphism_In_Java;

public class OverloadingCalculation2 {

	
	public static void main(String[] args) {
		
		OverloadingCalculation2 obj= new OverloadingCalculation2();
		
		System.out.println(obj.sum(10, 15));
		System.out.println(obj.sum(10, 20));
		
		
	}
		int sum(int a, int b)
		{
			
			return a+b;
		}
		long sum(long a, long b)
		{
			
			return a+b;
		}
	}
   

