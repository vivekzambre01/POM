package String_In_Java;

public class Format {

	public static void main(String[] args) {

		String name="SONNO";
		  float name2 = 21.65f;
		  float name3 = 22.65f;
		
	     String sf1 = String.format("name is %s",name );	
		
		System.out.println(sf1);//
		String sf2 = String.format("value is %s",name2);
		System.out.println(sf2);
		       String sf3 = String.format("value is %s",name3);
		       System.out.println(sf3);
		System.out.println(name2+name3);
		System.out.println(sf2+sf3);
		
		String std1=String.format("%d",101);
		System.out.println(std1);
		  String sft = String.format("%f",2121.21f);
		  System.out.println(sft);
		    String sxt = String.format("%x",101);	
		    System.out.println(sxt);
		  String stc = String.format("%c",'c');
		  System.out.println(stc);
		  System.out.println(std1+sft+sxt+stc);
		
		
		
		
		
		
		
	}

}
