package String_In_Java;

public class SubString {

	public static void main(String[] args) {
		
		String s1="javapoint";
		
		System.out.println(s1.substring(0));
		System.out.println(s1.substring(1, 4));
		System.out.println(s1.subSequence(0, 7));
		System.out.println(s1.length()-1);
		System.out.println(s1.length());
	}
}
