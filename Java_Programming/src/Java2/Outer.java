package Java2;

  
public class Outer {
	int a;
	public void show()
	{
	
		System.out.println("This  is Outer  Class");
		
	}

	class Inner
	{
		public void display()
		{
			System.out.println("Inner class display method");
		}
	

    class Sample
         {
        	public  void main(String[] args) {
				
        		
        		Outer o=  new Outer();
        		o.show();
        	//   Outer.Inner Obj1=o.new Inner();
        	   Inner Inn= new Inner();
        	   Inn.display();
        	   
			} 
        	 
         }
	}
}
	
	


