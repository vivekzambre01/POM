package collection;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {

		ArrayList al= new ArrayList();
		
		al.add(10);
		al.add(1, "vivek");
		al.add(10);
		al.add(20);
		al.add("asd");
		al.add('v');
		//al.addAll(al);
		al.add(0, "ritesh");
		System.out.println(al);
		System.out.println(al.subList(0, 2));
		
		
		

	}

}
