package Java;



public class Mydriver {
	
	public Mydriver()  //  Constructor first letter name is capital
	{
		System.out.println("Loading my driver");
	}
	public Mydriver(String name)
	{
		System.out.println("Loading my driver - name "+ name );
	}
	public Mydriver(int count)
	{
		System.out.println("Loading my driver  - count "+count);
		
	}
	public void Display() 
	{
	System.out.println(" i am in display method");	
	}
	public static void main(String[] args) {
		
		Mydriver obj = new Mydriver();
		Mydriver obj1 = new Mydriver("vivek");
		Mydriver obj2= new Mydriver(100);
		Mydriver obj3= new Mydriver(10);
		obj3.Display();
	}
	
	
}