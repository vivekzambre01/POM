package String_In_Java;

public class StringChar {

	public static void main(String[] args) {
		
	
		String s2="javapit";
		String s3=" ";
		
		char ch[]={'j','a','v','a','p','i','t'};
		    String viv = s3.copyValueOf(ch);
		    System.out.println(viv);
		
		    String jh = viv;
		     
		System.out.println(jh);
		
		if(jh==s2)
		{
			System.out.println("javapit");
			
		}
		else
		{
			System.out.println("ahgsjagjs");
		}
		
		
		
		

	}

}
