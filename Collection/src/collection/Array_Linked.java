package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_Linked {

	public static void main(String[] args) {

		List<String> la= new ArrayList<String>();
		la.add("abhay");
		la.add("checker");
		la.add(null);
		la.add(null);
		la.add("Rohan");
		la.add("checker");
	    la.add(null);
	    la.add("abhay");
	    la.add("checker");
		
		List<String> ll= new  LinkedList<String>();
		ll.add("asdf");
		ll.add("hsjsj");
		ll.add("uyusyu");
		ll.add("yyuyy");
		ll.add(null);
		ll.add(null);
		ll.add("asdf");
		ll.add("yyuyy");
		ll.add(null);
		
		System.out.println(la);
		System.out.println(ll);
		
		
		

	}

}
