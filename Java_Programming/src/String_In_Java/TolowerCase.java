package String_In_Java;

import java.util.Locale;

public class TolowerCase {

	public static void main(String[] args) {
		
		String s1="JAVAPOINT HELLO STRING";
		String s2="JAVAPOINT HELLO STRING";
		
		
		String s1lower = s1.toLowerCase();
	//	System.out.println(s1lower);
	 String eng = s2.toLowerCase(Locale.FRANCE);
	 System.out.println(eng);
	 
	   String france = s2.toLowerCase(Locale.forLanguageTag("i"));
	   System.out.println(france);
	           String s1upper = s1.toUpperCase();
	           System.out.println(s1upper);
	  String china = s2.toUpperCase(Locale.CHINA);
	  System.out.println(china);
		
		
		
	}
}
