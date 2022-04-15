package Inheritance_In_Java;

public class Hierarchical

{
	
 public static void main(String[] args)
 {
				 
		 D1 d= new D1();
		 d.D();
		 d.Hierarchiel();
		 d.D();
 }
   public void Hierarchiel()
   {
	   System.out.println("Hierarchiel");
   }
}
class A1 extends Hierarchical

{
	public void A()
	{
		System.out.println("A");
	}
}

class B1 extends Hierarchical
{
	public void B()
	{
		System.out.println("B");
	}
}

class C1 extends Hierarchical
{
	public void C()
	{
		System.out.println("C");
	}
}

 class D1 extends Hierarchical
 {
	 public void D()
	 {
		 System.out.println("D Method");
	 }
 }
 
 
