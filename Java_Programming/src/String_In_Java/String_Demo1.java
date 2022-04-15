package String_In_Java;

public class String_Demo1 {

	
	public static void main(String[] args) {
		
		String name="Selenium WebDriver()";
		
		boolean status=name.startsWith("Selenium");
		
		System.out.println("status is"+" "+status);
		
		boolean status1= name.startsWith("selenium");
		
		System.out.println("status is"+ " "+status1);
		
		 String name1="welcome to selenium Welcome world";
		 
		boolean status2 = name1.endsWith("world");
		System.out.println("status is "+" "+status2);
		
	     boolean status21 = name1.endsWith("qtp");
	     System.out.println("status is"+" "+status21 );
	}
	
}
