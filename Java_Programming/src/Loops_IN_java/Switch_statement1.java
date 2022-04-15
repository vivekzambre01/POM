package Loops_IN_java;

public class Switch_statement1 {

	public static void main(String[] args) {
		
		int month=12;
		String monthString=" ";
		//switch statement
		switch(month) {
		//case statement within same block
		case 1:
			monthString="1 - January";
		break;
		case 2:monthString="2 - Februry";
		break;
		case 3:monthString ="3 - march";
		break;
		case 4: monthString="4 - April";
		break;
		case 5:monthString ="5- May";
		break;
		case 6:monthString = "6 - jun";
		break;
		case 7:monthString="7 - july";
		break;
		case 8:monthString="8 - august";
		break;
		case 9:monthString ="9 - september";
		break;
		case 10: monthString="10 - octomber";
		break;
		case 11:monthString ="11 - november";
		break;
		case 12:monthString = "12 - December";
		break;
		default: System.out.println("invalid month");
			
		}
		System.out.println(monthString);
		

	}

}
