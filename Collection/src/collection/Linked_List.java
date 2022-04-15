package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("Abhay");
		ll.add("baban");
		ll.add("chetan");
		ll.add("Daman");
		ll.add("Eagle");
		ll.add(null);
		ll.add(null);
		ll.add(null);
		System.out.println(ll);
		for (String lin : ll) {
			
System.out.println(lin);		}
         System.out.println("*******");
	Iterator<String> itr = ll.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
	}
}
