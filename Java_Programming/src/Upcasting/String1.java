package Upcasting;

public class String1 {

	public static void main(String[] args) {
		
		String[] name = "vivek j zambre is an Automation Engineer".split(" ");
		
		String ans=" ";
		
		for(int i=name.length-1;i>=0;i--)
		{
			ans=ans+name[i]+" ";
		}
		  
		System.out.println("Reversed String :"+ans);  
		  
}
}