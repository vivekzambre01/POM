package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSet {

	public static void main(String[] args) {
	
		HashSet hs=new HashSet();
		hs.add("abc");
		hs.add('a');
		hs.add("abc");
		hs.add("abc");
		hs.add("abc");
		hs.add("abc");
		hs.add(null);
		hs.add(null);
		hs.add("pqr");
		System.out.println(hs.size());
		System.out.println(hs);
		hs.remove(null);
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains('B'));
		hs.add("xyz");
		System.out.println(hs);
		System.out.println("---print all the element of an hashset---");
	  Iterator itr = hs.iterator();
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
		   }
		   System.out.println(hs);
	       hs.clear();
	       System.out.println(hs.size());
	       System.out.println(hs.isEmpty());
      

		
	}

}
