package Loops_IN_java;

public class ContinueExample {

	public static void main(String[] args) {


		for(int i=1;i<=22;i++)
		{
			if(i==5||i==10||i==15||i==20)
			{
				continue;//it will skip the rest statement 
			}
			System.out.println(i);
			
		}

	}

}
