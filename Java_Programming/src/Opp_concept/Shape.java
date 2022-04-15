package Opp_concept;

public abstract class Shape {
	
	public abstract void Area();
	
	
	
}

 class Triangle
 {
	 int Area()
	 {
		int A = 1/2*50*40; 
		System.out.println(A);
		return A;
	 }
 }
 
 class Rectangle
 {
	int Area()
	{
		int A = 50*50;
		return A;
	}
 }
 class Circle
 {
	int Area()
	{
		   int A = 30*30;
		   System.out.println(A);
		   return A;
	}
 }