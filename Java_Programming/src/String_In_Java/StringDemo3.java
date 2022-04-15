package String_In_Java;

public class StringDemo3 {
 
	public static void main(String[] args) {
		
		String str1="abc";
		String str2="abc";
		String str3= new String("abc");
		String str4=new String("abc");
		
		if(str3==str4)              //when creating object it is stored in Non-constant pool Area
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("creating object False");//false
	}
		
		if(str1==str2)                 //constant pool area 
		{
			System.out.println("string is true");
		}
		else
		{
			System.out.println("String is false");//true
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
