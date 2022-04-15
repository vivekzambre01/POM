package String_In_Java;

public class Concat {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="JavaPoint";
		String str3="Reader";
		String str4=" ";
		
		String asd = str1.concat("!!!");
		String usd = str1.concat("@@##$$%%^^&&**");
		
	 System.out.println(str1.concat(" ").concat(str2).concat(" ").concat(str3));
	 System.out.println(asd);
	 System.out.println(usd);
	 
	 System.out.println("one".concat(" ").concat("two").concat(" ").concat("three").concat(" ").concat("four"));
	 System.out.println(str1+str4+str3+str2);
	 
	 
	}
}
