package Opp_concept;

public interface Test1 {
	
	void a();
	void B();
	void C();
	void D();

}

abstract class B implements Test1{
	public void C()
	{
		System.out.println("i am method C");
	}
}

class M extends B{
	public void a() {
		System.out.println("I am in Method A");
	}

	public void B() {
		System.out.println("I  am in method B");
	}

	public void D() {
		
		System.out.println(" I am in method D");
	}
	}
	

