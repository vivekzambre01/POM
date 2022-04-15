package String_In_Java;

import java.util.ArrayList;

public class Method_of_StringClass {

	public static void main(String[] args) {
		
		String str1 = "Margarita";
		String str2="Margarita";
		String str3="rita";
		String str11=" ";
		//String str12=null;
		
		System.out.println(str1.equals(str2));//true
		System.out.println(str1.equals(str3));//false
		System.out.println(str1.equalsIgnoreCase(str2));//true
		System.out.println(str1.contains(str3));//true
		 String str4 = str1.concat("hjhhjhh");
		 System.out.println(str4);//Margaritahjhhjhh
		 System.out.println(str1.charAt(6));//i
		 System.out.println(str1.charAt(0));//M
		 System.out.println(str1.isEmpty());//false
	//	 System.out.println(str12.isEmpty());//need to discuss
		 System.out.println("*********check string starts with and end with************");
		 System.out.println(str1.startsWith("Marg"));//true
		 System.out.println(str1.startsWith("hhgjhg"));//false
		 System.out.println(str1.endsWith("rita"));//true
		 System.out.println(str1.endsWith("kjh"));//false
		 System.out.println("********substring*******");
		        String strs = str1.substring(4);
		        System.out.println(strs);//arita
		        String stra = str1.substring(0);
		        System.out.println(stra);//Margarita
		          String strq = str1.substring(1,8);
		          System.out.println(strq);
		            CharSequence chs = str1.subSequence(0, 9);
		            System.out.println(chs);
		            String str13 = "abcabcbcdabc";
		                 String gg = str13.substring(6, 9);
		                 System.out.println(gg);
		                 
		                 String name1="vivek zambre";
		                 String name2="jayadip prajapti";
		                 String name3="Abhishekh pande";
		                 String name4="kishan pathar";
		                 
		                 String[] arr = name1.split("vivek");  
		                 for (String w : arr) {  
		                     System.out.println(w);  
		                 }  
		              //   System.out.println("Split array length: "+arr.length);
		                 String[] arr1 = name2.split("jayadip");  
		                 for (String w1 : arr1) {  
		                     System.out.println(w1);  
		                 }
		                 String[] arr2 = name3.split("Abhishekh");  
		                 for (String w2 : arr2) {  
		                     System.out.println(w2);  
		                 }
		                 String[] arr3 = name4.split("kishan");  
		                 for (String w3 : arr3) {  
		                     System.out.println(w3);  
		                 }
		
	}
	
	
	
	
	
}
