package Java;

public class Type_casting {

	public static void main(String[] args) {
		
//converting one data type to another data type 
//three type of type  casting 
//implicit type casting: converting lower data type of information into higher data type of information
//complier will  automatically convert it no data losses 		
//explicit type casting : converting higher data type of information into lower data type of information
//we are manually convert it 		
//boolean type casting : define only true and false 
		
		
//implicit type casting:
		
		int a=10; //4 bytes
		double b=a;//8 bytes

		int  R=30;
		System.out.println(b);//complier will automatically convert it lower into Higher data  type
//Explicit type casting
		double d=9;
		System.out.println(d);
		
		
		
		double x= 20.5;
		double p=30.5;
		float s=(float) 40.5;
		int y= (int) x;
		long q=(long) p;
		int t=  (int) s;
		System.out.println(y);
		System.out.println(q);
		System.out.println(t);
		    int i= Integer.parseInt("200");
		    String j= Integer.toString(i);
		
		
		
		
		
		

	}

}
