package newprogrm;

import java.util.ArrayList;

public class Class3 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("abc");
		al.add("pqr");
		al.add(100);
		al.add('a');
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		al.add(200);
		al.add(300);
		System.out.println(al);
        al.set(4,"xyz");
        System.out.println(al);
        al.set(2,'v');
        System.out.println(al);
        al.remove(5);
        System.out.println(al);
        System.out.println(al.size());
        al.add("ddd");
        al.set(3,'s');
        System.out.println(al);
        
        
        
        
        
	}

}
