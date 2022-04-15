package String_In_Java;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		String str= "jayadip Prajapti ahamadabad";
		
		System.out.println(str.indexOf('a'));
		System.out.println(str.split(" ")[2]);
		System.out.println(str.substring(str.indexOf(" ")+0,str.length()));
		RemoveWhiteSpace hh= new RemoveWhiteSpace();
		hh.characterprint();
		hh.replaceall();
		hh.Hello();
	}
	
	public void characterprint()
	{
		{  
			String str= "@small hello new$";   
			str = str.replaceAll("[small hello new]", "");  
			System.out.println(str); //@$ 
			}
		System.out.println("*********");
	}
	public void replaceall()
	{
	   String 	input= "SoftwarE testing";
	       for(int i=0;i<=input.length()-1;i++)
	       {
	    	   System.out.println(i);
	       }
	        String vv = input.replaceAll("viveK zambre","Software Testing");
	            
	            System.out.println(vv);
	   
	}
	public void Hello()
	{
		String str="welcome ,hello: how are you";
		  System.out.println(str.split(",")[1]);
		  System.out.println(str.split(":") [1]);
	 // System.out.println(str.substring(str.indexOf(" ")+0,str.split(",", [5]));
		//  String joinString1=String.join("-","welcome","to","javatpoint");
		   String[] hgg = str.split("\\,|\\s+");
		   System.out.println(str);

	}
 
} 


//
//String gg = str.split(" ")[1];
//System.out.println(gg);
//           String repl = gg.replaceAll(",hello:","hello");
//           System.out.println(repl);
