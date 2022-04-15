package Polymorphism_In_Java;

public class ChildClass extends ParentClass  {

	public static void main(String[] args) {
		
		ChildClass obj1 = new ChildClass();
		obj1.display();
		obj1.display("vivek");
		obj1.show();
		
		ParentClass parent1 =new ParentClass();
		parent1.display();
		
		ParentClass obj2= new ChildClass();
		obj2.display();
		obj2.display();
		obj2.show();
		//obj2.dispay("ritesh");//not call child class method
		obj2.display();
	}


public void display()
{
	System.out.println(" I am in child class display method");
}

public void display(String name)
{
	System.out.println("I  am in child class parammeter method"  + name);
}
}