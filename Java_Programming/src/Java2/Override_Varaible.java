package Java2;

public class Override_Varaible {
	
	public static void main(String[] args) {
		
		Override_Varaible s= new Override_Varaible();
	s.test1();
	s.test2();
		
	}
	public void  test1() 
	{
		int a=10;
	a=50;
	char c='c';
	  c='v';
	  String s="vivek";
	   s="ritesh";
	   s="mayur";
	   double d=10.20;
	   d=30.2;
   
	    System.out.println(a);
	    System.out.println(c);
	    System.out.println(s);
	    System.out.println(d);
	}
	public void test2()
	{
		//System.out.println("test2");
	}

}
