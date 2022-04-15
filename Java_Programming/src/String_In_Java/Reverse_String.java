package String_In_Java;

public class Reverse_String {
	
	public static void main(String[] args) {
        
	
		String name="vivek";
		     
		  int hh = name.length();
		  System.out.println(hh);
		  String rev=" ";
		  for(int i=hh-1;i>=0;i--)
		  {
			     rev=    rev+ name.charAt(i);
		  }
	    System.out.println(rev);
	
}
}
