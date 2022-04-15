package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List2 {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("abc");
		al.add("qwe");
		al.add("pqr");
		al.add("std");
		al.add("bcd");
	    Iterator itr = al.iterator();//Getting the Iterator
	    while(itr.hasNext())//check if the Iterator has the Element
	    {
	    	System.out.println(itr.next());//Printing the element and move to next
	    }
	    
		
		

	}

}