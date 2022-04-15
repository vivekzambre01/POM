package String_In_Java;

public class Length {

	public static void main(String[] args) {
	
		String s1="javapoint";
		String s2="python";
		String s3="";
		System.out.println("String length is:"+s1.length());
		System.out.println("string lenth is :"+s2.length());

		
		if(s1.length()>5)
				
		{
			System.out.println("s1 length  is greater then 5");
		}
		else
		{
			System.out.println("s1 Length is less then 5");
		}
		
		if(s3.length()==0||s1.length()==9)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
	}

}
