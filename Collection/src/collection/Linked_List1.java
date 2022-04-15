package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;

public class Linked_List1 {

	public static void main(String[] args) {
		
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("adsf");
		ll.add("bjhjh");
		ll.add("ckjhhj");
		ll.add("dhhh");
		ll.add("eddd");
		ll.add("fggg");
		ll.add("fddhgjhg");
		
		 Iterator<String> h = ll.descendingIterator();
		 while(h.hasNext())
		 {
			 System.out.println(h.next());
		 }
		 ll.add("ghjh");
		 ll.remove(2);//remove basis on Index
		 System.out.println(ll);
		 ll.removeFirst();  //remove the  First element from List
		 System.out.println(ll);
		 ll.removeLast();
		 System.out.println(ll);//remove Last element from list
		 ll.set(0,"adsf");
		 System.out.println(ll);
		 ll.set(4, "vivek");
		 System.out.println(ll);//set the value at specified index
		 ll.size();
		 System.out.println(ll);
		 ll.offer("Random");
		 ll.offerFirst("first");//added first index
		 ll.offerLast("Lasti");//random insert value
		 System.out.println(ll);//added Last Index
		 ll.pollFirst();
		 System.out.println(ll);//remove first element from the list
		 ll.pollLast();
		 System.out.println(ll);//remove Last element from  List
		 ll.push("xxxx");
		 System.out.println(ll);//push element onto the stack represented by the stack
		ll.indexOf(1);
		ll.lastIndexOf(h);
		System.out.println(ll);
		ll.remove(5);
		System.out.println(ll);//remove index 5 value
		
	}

}
