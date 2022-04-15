package Java;

public class Parameter_Method {
	
	public static void main(String[] args) 
	
	{
		methodA(10);
		methodB();
		methodc(20,30.20,true,'v');
		Parameter_Method method=new Parameter_Method();
		method.methodd(5, 5);
	}
   public static void methodA(int A) //single parameter value 
   {
	   System.out.println("inside method having single parameter value=>>:"+A);
   }
   public void methodd(int a, int b)
   {
	   System.out.println("inside method D  passing two parameter"+a+" "+b);
   }
   public static void methodB() //no parameter 
   {
	System.out.println("indide methodB having no parameter:");   
   }
   public static void methodc(int a,double b,boolean c,char d) //Multiple parameter value
   {
	System.out.println("inside method having multiple parameter value=>>:"+a+" "+b+" "+c+" "+d);   
   }
   
}
