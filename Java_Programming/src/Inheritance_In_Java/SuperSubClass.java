package Inheritance_In_Java;

public class SuperSubClass extends Superclass{
	
	public static void main(String[] args) {
		
		SuperSubClass  obj1 =new SuperSubClass();
		obj1.superclassmethod1();
		obj1.superclassmethod2();
		obj1.supersubclassmethod1();
		obj1.supersubclassmethod2();
	}
	
	public void supersubclassmethod1()
	
	{
	  System.out.println("This is a supersubclassmethod1");	
	}
	
	public void supersubclassmethod2()
	{
		System.out.println("this is supersubclassmethod2");
	}

}
