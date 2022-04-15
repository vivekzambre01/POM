package Interface_Demo;

public class Test2 {

	public static void main(String[] args) {
		
		Bank b= new SBI();
		b.rateofinterest();
		
   System.out.println(b.rateofinterest());
        
   Bank b1= new PNB();
        System.out.println(b1.rateofinterest());
	}

}
