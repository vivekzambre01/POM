package Inheritance_In_Java;

public class Sub_Class extends SuperSubClass{
	
	
	public static void main(String[] args) {
		
		
		Sub_Class sub= new Sub_Class();
		
		sub.subclassmethod1();
		sub.subclassmethod2();
		sub.superclassmethod1();
		sub.superclassmethod2();
		sub.supersubclassmethod1();
		sub.supersubclassmethod2();
		
		
	}
	
	
public void subclassmethod1()
	
	{
	  System.out.println("This is a supersubclassmethod1");	
	}
	
	public void subclassmethod2()
	{
		System.out.println("this is supersubclassmethod2");
	}

}
