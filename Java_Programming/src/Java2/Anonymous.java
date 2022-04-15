package Java2;


class A
{
	public void show()
	{
		System.out.println("in A show");
	}
}
 class B extends A
 {
	 public void show()
	 {
	System.out.println("extend class metho");
		 
	 }
	 
 }

public class Anonymous 
{
	public static void main(String[] args) {
		A obj=new B(); 
	     {
	    	obj.show(); 
	     }
	}
    
	
	
}

  
