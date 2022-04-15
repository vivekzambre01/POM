package String_In_Java;

public class Intern {

	public static void main(String[] args) {
		
		
		String s1=new String("hello"); 
		String s2="hello";
		
        String s3 = s1.intern();//return string from pool, now it will  be same as s2
        
        System.out.println(s1==s2);//false because reference variable are pointing to different instance
        System.out.println(s2==s3);//true because reference variable are pointing to same instance
        
          String t1="javapoint";
          String t3= new String("javapoint");
            String p1 = t1.intern();
            System.out.println(p1);
         
            System.out.println(t1==t3);//false because reference variable are pointing to different instance
            System.out.println(t1==p1);//true because reference varible are pointing to same instance
        

	}

}
