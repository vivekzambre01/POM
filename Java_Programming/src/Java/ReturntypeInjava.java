package Java;

public class ReturntypeInjava 
{

	public void test1(int i)
	{
		System.out.println(i);
	}
	public char test2()
	{
		int a=10;
		return 'c';
	}
	public String test3()
	{
		return "gfhgf";
	}
	public int  test4()
	{
		int a=10;
		return a;
		if(int a<=10)
		{
			System.out.println("return same value");
		}
		else {
			System.out.println("return ");
		}
		
	}
	public boolean  test5()
	{
		return true;
	}
	public int[] test6()
	{
		return new int[7];
	}
	
	
	public static void main(String[] args) 
	{
		ReturntypeInjava  ret=new ReturntypeInjava();
		  ret.test1(100);//initiatize value of  method 
		
		char ll = ret.test2();
		System.out.println(ll);
		String kk = ret.test3();
		System.out.println(kk);
	//	int jj = ret.test4();
	//	System.out.println(jj);
		System.out.println(ret.test4()+100);
		
	//ret.test5();
		//ret.test6();
	//	System.out.println(test4);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
