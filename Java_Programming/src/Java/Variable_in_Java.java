package Java;

public class Variable_in_Java {

	int b=30;//instance variable
	static int c=20;  //static variable
		public static void main(String[] args)
	{
		int a=10;//local variables
		System.out.println(a);
		System.out.println(Variable_in_Java.c);//we can call static variable class name.variable name 
		System.out.println(c);
		Variable_in_Java instance =new Variable_in_Java();
		System.out.println(instance.b);// we can call instance variable by creating object of class
		instance.test();
		
		
	}
	public  void test()
	{
	int  b=40;
		c=50;
		System.out.println(c);
		System.out.println(b);
	}
		

		
	
	

}
