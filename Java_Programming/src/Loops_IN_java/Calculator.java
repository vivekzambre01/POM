package Loops_IN_java;

public class Calculator {

	public static void main(String[] args) {
		

		Calculator cal= new Calculator();
		
		
		System.out.println(cal.add(10, 20));
		System.out.println(cal.sub(20.2, 10.2));
	}
	
	public int add(int a, int b){return a+b;}
	{
		System.out.println("adding method");
	}
     public double sub(double a, double b)
     {
    //	 System.out.println("substraction method");
   
     return (a-b);
     }
     
}
