package String_In_Java;

public class Replace {

	public static void main(String[] args) {
		
		String s1="javapoint is a very is good webside";
		
		  String replace = s1.replace('j','v' );
		  System.out.println(replace);
		    String replace1 = s1.replace('v','j');
		    System.out.println(replace1);
		      String replace2 = s1.replaceAll("javapoint","c point ");
		      System.out.println(replace2);
		        String replace3 = s1.replaceFirst("javapoint","c++  point");
		        System.out.println(replace3);
		  String ss1 = s1.replaceFirst("is a","was");
		  System.out.println(ss1);
		  String t1="My name is Khan. My name is Bob. My name is Sonoo.";  
		    String tt1 = t1.replaceFirst("is","first");
		    System.out.println(tt1);
		 String jk = t1.replaceAll(" ","");
		 System.out.println(jk);

	}

}
