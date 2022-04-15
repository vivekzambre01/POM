package Loops_IN_java;

public class switchStatement4 {

	public static void main(String[] args) {
		//declearing string variable
		String levelString="Expert";
		String Level;//using string in switch expression
		switch(levelString)
		{
		//using string Literal in switch statement
		case "Beginner":Level="za";
		break;
		case "Intermediate": Level="va";
		break;
		case "Expert": Level ="vaa";
		break;
		default:Level="hj";
		break;
		}
		System.out.println("your Level is "+Level);
		}
		

	}


