package Interface_Demo;

public class AdvanceCal implements Calc{

	public static void main(String[] args) 
	
	{
		
	AdvanceCal advance = new AdvanceCal();
	//	Calc cal= new AdvanceCal();//base class reference and clild class object allow to access only base class method 
	//	cal.add();
	//	cal.sub();
		
		advance.sub();
		advance.add();
		advance.calculatesin();
		advance.calculatecos();
		advance.sub(); 
		advance.add(); 
		advance.add(10, 20);
		advance.sub(10);
		advance.div(10.2, 20.2);
		
		
	//	Calc base= new Calc(); cannot initiate type calc we cannot create object of interface
	//	base.add();
		
	//AdvanceCal adcal= new Calc(); cannot create object of interface because it is abstract method
	
		
	}
	public void calculatesin() 
	{
		System.out.println("i am in calculatesin method");
	}
	public void calculatecos() 
	{
		System.out.println("i am in calculatecos method");
	}


	public void sub(int a) {
		System.out.println("i am in sub method");
			}
	public void add(int a, int b) {
		
		System.out.println("i am in add method");
	}
		
	
	
	public void div(double a, double b) {

   System.out.println("double method");
		
	}
	
	
}
