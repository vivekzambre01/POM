package Java;

public class Overloading {

		
	public static void main(String[]args) {
	
		
		Overloading obj = new Overloading();
		obj.addition(10.10,20.20);
		obj.addition(5.5,5.5);
		obj.addition(10, 10.1);
	}
		public void addition(int a , int  b) 
		{
		System.out.println(a+b);	
		}
		
		public void addition(double a , double b) 
		{
		System.out.println(a*b);	
		}

		public void addition(int a , double b) 
		{
		System.out.println(a+b);	
		}
		
		
}

