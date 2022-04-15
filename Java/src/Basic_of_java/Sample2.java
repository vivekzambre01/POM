package Basic_of_java;

import java.util.ArrayList;

public class Sample2 {

	public static void main(String[] args) {
	
		
		int arr2[]= {1,2,3,4,5,6,7,8,9,10,122};
		for (int i=0;i<arr2.length;i++)
			
			if(arr2[i] % 2  ==  0)
		{
			System.out.println(arr2[i]);
			break;
		}
			else
			{
				
				System.out.println(arr2[i] + "is not multiple  of 2");
			}
		
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("vivek");
		al.add("Ritesh");
		al.add("Durgesh");
		al.add("Gaurav");
		System.out.println(al);
		al.add(0, "kk");
		System.out.println(al);
		al.isEmpty();
		al.clone();
		System.out.println(al);
		al.contains(al);
		System.out.println(al);
		al.trimToSize();
		System.out.println(al);
		
		
		String s= "Rahul kjhkhjah jagj";
		String[] dfd = s.split(" ");
		System.out.println(dfd[0]);

		
		
		
		
		
		
	}

}
