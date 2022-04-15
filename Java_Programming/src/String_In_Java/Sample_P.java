package String_In_Java;

import java.util.ArrayList;

public class Sample_P {

	
	public static void main(String[] args) {
		
	      
        String name1 = "Mukesh Patil";
        String name2 = "Ritesh Tiwari";
        String name3 = "Mayur Jaiswal";
        String name4 = "Pravin matre";
        
        ArrayList<String> list = new ArrayList<>();  
        list.add("Mukesh Patil");   
        list.add("Ritesh Tiwari");  
        list.add("Mayur Jaiswal");  
        list.add("Pravin matre");  
        
            String[] arr1 = name1.split("Mukesh");  
            for (String m1 : arr1) {  
                System.out.println(m1);  
            }
            System.out.println(list);
             
	}
}

