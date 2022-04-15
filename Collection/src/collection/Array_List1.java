package collection;

import java.util.ArrayList;

public class Array_List1 {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("Burj");
		al.add(1,"Khalipha");
	    al.add(null);
		al.add(2,"Al street");
		al.add("Street lv");
		al.add("Tushar");
		al.add("Mayur");
		al.add("10");
		System.out.println(al);
		al.contains(null);
		al.add(3,"Jignesh");
		System.out.println(al);
		al.add(4,"dipal");
		System.out.println(al);
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(null);
		System.out.println(al);//arraylist accept multiple null value
		al.remove(2);//remove 2 nd index value
		System.out.println(al);
		al.subList(0, 5);
		System.out.println(al);
		al.trimToSize();
		System.out.println(al);
		
		
		
		

	}

}
