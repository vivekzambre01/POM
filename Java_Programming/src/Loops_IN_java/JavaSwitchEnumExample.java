package Loops_IN_java;

public class JavaSwitchEnumExample {
	public enum Day {  Sun, Mon, Tue, Wed, Thu, Fri, Sat }
	public static void main(String[] args) {
		Day[] DayNow = Day.values();
	
		for (Day now : DayNow)
		{
			
			switch (now)
			{
			case Sun:
				System.out.println("Sunday");
				break;
			case Mon:
				System.out.println("Monday");
				break;
			case Tue:
				System.out.println("Theusday");
				break;
			case  Wed:
			System.out.println("Wednesday");
			break;
			case Thu:
				System.out.println("Theusday");
				break;
			case Fri:
				System.out.println("Friday");
				break;
			case Sat:
				System.out.println("saturday");
				break;
				
				
			}
			
		}
		
	 }
}
		

	


