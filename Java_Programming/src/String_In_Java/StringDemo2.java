package String_In_Java;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String actual ="welcome to Selenium Webdriver world";
		
		String expected="Selenium";
		   boolean A1 = actual.contains(expected);
		   System.out.println("status is"+" "+A1);//true
		   
		   String exp1="Mukesh";
		    boolean B1 = actual.contains(exp1);
		    System.out.println(B1);//false

	}

}
