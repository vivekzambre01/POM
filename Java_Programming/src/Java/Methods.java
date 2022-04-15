package Java;

public class Methods {
	
	public void add()
	{
		System.out.println("add method");
	}
	public static  void Sub()
	{
		System.out.println("static method call static method");
	}
	public static void main(String[] args) {
		
		Methods M=new Methods();
		M.disp();
		M.add();
		Sub();//we can call static method by method name 
		Methods.Sub();//or we can call static method by class name.method name 
	}

	public void disp()
	{
		System.out.println("Learn Method Calling");
	}
}
