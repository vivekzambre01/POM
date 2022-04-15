package Java;

public class This_Keyword

{
	int a; //instance variable
	int p;
	public This_Keyword(int a)  //local variable
	{
        	this.a=a;
		

	}
         public This_Keyword(int c, int d)
	{
		int p=c+d;
		System.out.println(p);
		
	}
	void show()  //same 
	{
		System.out.println(a);
	}
	void show1()
	{
		System.out.println(p);
	}
	public static void main(String[] args) {
		
		This_Keyword th=new This_Keyword(20);
		  th.show();
		This_Keyword th1=new This_Keyword(20,10);
	  
	   th1.show1();
		
	
	}
	

	
	
	
	
}
