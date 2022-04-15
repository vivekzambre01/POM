package String_In_Java;

public class Valueof {

	public static void main(String[] args) {
	
		
		char ch1='A';
		char ch2='B';
		
		String s1 = String.valueOf(ch1);
		String s2=String.valueOf(ch2);
		System.out.println(s1+s2);//convert to string
		
		System.out.println(ch1+ch2);//character value
		
		  float f = 10.05f;
		 double  d=10.02;
		 
		    String f1 = String.valueOf(f);
		    String d1 = String.valueOf(d);
		    System.out.println(f1+d1);//covert to string
		    System.out.println(f+d);//
		    
		    char chr[]={'j','a','v','a'};  
		    long l = 14L;  
		    short sh = 12;
		     System.out.println(String.valueOf(chr));
		     System.out.println(String.valueOf(l));
		    
		
	}

}
