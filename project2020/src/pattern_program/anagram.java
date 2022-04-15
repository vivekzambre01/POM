package pattern_program;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		String str1="recitals";
		String str2="articles";
		if(str1.length()==str2.length()) 
		
		{
		        char[] arr1 = str1.toCharArray();	
		        Arrays.sort(arr1);
		       System.out.println(Arrays.toString(arr1));
		        
		        char[] arr2 = str2.toCharArray();
		      
		        System.out.println(Arrays.toString(arr2));
		        
		        System.out.println(arr1.equals(arr1));
		        
		        System.out.println(Arrays.equals(arr1, arr2));
		        
		        if(arr1.equals(arr2)) 
		        
		        {
		        System.out.println("Given string are anangram");		        
		        
		        }
		        else
		        {
		        	System.out.println("Given string are not anagram");
		        }
		        
		        
		}
	}
}
