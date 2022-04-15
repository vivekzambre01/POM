package Loops_IN_java;

public class JavaNestedIfExample2 {

	public static void main(String[] args) {
		
		int age=25;
		int weight=51;
		
		if(age>=26) {
			if(weight>51)
			{
				System.out.println("you are elizible to donate blood");
				
			}else
			{
				System.out.println("you are not elizible to donate blood");
				
			}
		}else
		{
			System.out.println("Age must be greater then 18");
		}

	}

}
