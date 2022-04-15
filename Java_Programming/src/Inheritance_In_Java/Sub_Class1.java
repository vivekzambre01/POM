package Inheritance_In_Java;

public class Sub_Class1 extends Sub_Class
{
	
	public static void main(String[] args) {
		
		Sub_Class1 sub1= new Sub_Class1();
		sub1.superclassmethod1();
		sub1.superclassmethod2();
		sub1.supersubclassmethod1();
		sub1.supersubclassmethod2();
		sub1.subclassmethod1();
		sub1.subclassmethod2();
		
		sub1.method1();
		System.out.println(sub1.method1(10));
		
		
		
	}
	
	public void method1()
	{
	  System.out.println("method 1 is  running ");	
	}
	public int method1(int a)
	{
		int b=a;
		 
		return b;
	}

}
