package Opp_concept;

public class HRTeam extends ITDepartment {
	
	public static void main(String[] args) {
		
		HRTeam  hr = new HRTeam(); //impliement class of an all  the abstract class
		hr.goodies();
		hr.work();
		hr.salary();
		hr.Bonus();
		
		ITDepartment  it = new HRTeam();// abstract class 
		it.goodies();
		it.work();
	    it.salary();
	
		
	//	ITDepartment it1= new ITDepartment(); // if class  is not fully  impliement we cannot  create object off class
	//interface dont have single method is impliment dont have to create  object of interface.
	//interface 100% abstract class
		
	}
     
	public void Bonus()
	{
		System.out.println("Bonus in year");
	}
	
	public void salary() {
	
		System.out.println("10 lack PA");
	}

}
