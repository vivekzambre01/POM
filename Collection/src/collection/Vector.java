package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class Vector {

	public static void main(String[] args) {
    Vector  vr=new Vector();
    vr.add("abc");
    System.out.println(vr);
    System.out.println(vr.capacity());
    System.out.println(vr.size());
    vr.add("abc");
    vr.add(100);
    vr.add('c');
    vr.add(null);
    vr.add(null);
    System.out.println(vr);
    vr.set(4,'v');
    System.out.println(vr);
    vr.add(200);
    vr.remove(4);
    System.out.println(vr);
    vr.remove(5);
    System.out.println(vr);
        System.out.println("----print all the element in the vector-----");
      for(int i=0;i<=vr.size()-1;i++) {
    	System.out.println(vr.get(i));
      }
    System.out.println("---print all element using iterator cursor--");
                   Iterator it = vr.iterator();
                   while(it.hasNext()) {
                	   System.out.println(it.next());
                   }
     System.out.println("-----print all the element using enumerator cursor---");
                  Enumeration en = vr.elements();
     	        while(en.hasMoreElements()) 
     	        {
     	        System.out.println(en.nextElement());	
     	        }
              vr.add("vivek");
              System.out.println(vr);
                          ListIterator ar = vr.listIterator();
                            while(ar.hasNext()) {
                            	System.out.println(ar.next());
                            }
                            System.out.println("----print---");
                                     Iterator arr = vr.iterator();
                                     while(arr.hasNext()) {
                                    	 System.out.println(arr.next());
                                     }
                                 
                                      
                          
    
    
    
	}

}
