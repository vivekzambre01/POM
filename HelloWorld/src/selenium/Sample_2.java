package selenium;

import java.util.HashMap;
import java.util.Set;

public class Sample_2 {
	
	public static void main(String[] args) {
		
		String arr[]={"JAVA","JSP","SERVET","JAVA","STRUCT","JSP","JDBC","JAVA","JDBC"};
		
		HashMap<String,Integer>map=new HashMap<String,Integer>();
		
		for (String str : arr) {
			
			if(map.containsKey(str))
			{
				map.put(str, map.get(str)+1);
			}else
			{
				map.put(str, 1);
			}
			
		}
		   Set<String> set = map.keySet();
		  for (String str : set) {
			  
			  if(map.get(str)>1) {
				  System.out.println(str+": "+map.get(str));
			  }
			
		}
		
		
		
	}

}
