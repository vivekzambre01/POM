package String_In_Java;

public class lastIndexOf {

	public static void main(String[] args) {
		
		String str="This is last index of example";
		
		 int index = str.lastIndexOf("his");
		 System.out.println(index);
		 System.out.println(str.length());
		 
		   int  index1=str.lastIndexOf(' ',5);
		       System.out.println(index1);  
		       
		     int hhb = str.lastIndexOf("is",20);
		     System.out.println(hhb);

	}

}
