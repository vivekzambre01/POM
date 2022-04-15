package Java;

public class PersonMethod {
	
	String name="Sameer";
	public void display() 
	{
		System.out.println("this is super class Method ");
	
	}
	public static class EmployeeMethod extends PersonMethod
	{
	String name ="Monica";
	//String Name ="Monica";
	public void display() 
	{
		System.out.println("super class name=>>: "+super.name);// call super class name 
		System.out.println("sub class name =>>:"+name);
		//System.out.println("sub class name =>>:"this.Name);
	}
	
	public void finaldisplay()
	{
		super.display();
	}
	public static void main(String[] args)
	{
		EmployeeMethod em= new EmployeeMethod();
		em.display(); // call sub class method 
		em.finaldisplay();//call super class method
	}
	}
  }
