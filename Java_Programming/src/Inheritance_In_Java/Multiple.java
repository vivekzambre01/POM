package Inheritance_In_Java;

public class Multiple implements A,B,C,D,E
{

	public static void main(String[] args) {
	
		Multiple m= new Multiple();
		m.showA();
		m.showB();
		m.showC();
		m.showD();
		m.showE();
		
	}
	public void showD() {
		System.out.println("method D");
		
	}

	
	public void showC() {
		System.out.println("method C");
		
	}

   public void showB() {
	    System.out.println("method B");
	}

	public void showA() {
		System.out.println("method A");
			}
	
	public void showE() {
		
		System.out.println("method E  running");
		
	}

}
