package Inheritance_In_Java;

public class Child_Class extends Base_Class{

	public static void main(String[] args) {
		
		
		Child_Class child = new Child_Class();//using clild class object access alll method of base class and child class
		child.Multiplication();
		child.Division();
		child.add();
		child.sub();
		
		Base_Class base= new Child_Class();//allow to access an only base class method
		base.add();
		base.sub();
		
		Base_Class base1 = new Base_Class();//allow to access an only base class method
		base1.add();
		base1.sub();
		
	}
	public void Multiplication()
	{
		System.out.println("Hey im in multiplication method");
	}
	public void Division()
	{
		System.out.println("Hey i am in Division method");
	}


}
