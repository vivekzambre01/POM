package Java2;

public class Wrapper1 {

	public static void main(String[] args) {
		
		String man1="462.95";
		
		String man2="237.05";
		
		    System.out.println(man1+man2);  
		   double P1 = Double.parseDouble(man1);
		   double P2 = Double.parseDouble(man1);
		   System.out.println(P1+P2);
		   
		   //Boxing 
		   int x=90;
		   Integer Y=100;
		   Integer D=200;
		   System.out.println(Y);
		   System.out.println(Y+D);
		   System.out.println("***********");
		        String Int = Integer.toString(Y);
		    String Int1 = Integer.toString(D);
		        System.out.println(Int+Int1);
		        System.out.println("**************");//Integer to string 
		   
		   Integer y = Integer.valueOf(x);
		   System.out.println(y);
          
		 
	}

}
