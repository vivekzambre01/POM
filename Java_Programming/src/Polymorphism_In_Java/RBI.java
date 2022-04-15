package Polymorphism_In_Java;

public class RBI {

	public static void main(String[] args) {
		
		SBI I = new SBI();
		HDFC h= new HDFC();
		Axix a= new Axix();
		
		System.out.println(I.rateofinterest());
		System.out.println(h.rateofinterest());
		System.out.println(a.rateofinterest());
		
		

	}

}
