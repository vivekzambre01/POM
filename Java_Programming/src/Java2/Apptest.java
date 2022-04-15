package Java2;

public class Apptest {

	public static void main(String[] args) {

      // Apptest2 Test2 = new Apptest2();
       //Test2.Test2();
    Apptest Test= new Apptest();
      Test.test();
		

	}
    public void test()
    {
    	System.out.println("Test running ");
    	Apptest app= new Apptest();
    	Apptest2 app1=new Apptest2();
    	{
    		app.test();
    		app.test1();
    		app1.Test2();
    	}
    }
    public void test1()
    {
    System.out.println("Test1 is running");	
    }
}

class Apptest2
{
	public void  Test2()
	{
		System.out.println("Apptest Test 2 is running");
		
	}
}
