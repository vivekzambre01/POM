package Loops_IN_java;

public class BreakExample {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			if(i==6)
			{
				System.out.println("break loop");
				break;
			}
			System.out.println(i);
		}

	}

}
