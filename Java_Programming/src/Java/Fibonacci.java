package Java;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n=10, firstTerm = 0, secondTerm = 1;
		System.out.println("fibonacci Series till " + n + " terms:");
		
		for( int i =1;i<=n;++i)
		{
			System.out.println(firstTerm + " ");
			
			//compute the next term
		
		
		int nextTerm = firstTerm + secondTerm;
		 firstTerm= secondTerm;
		 secondTerm = nextTerm;
		 
			}
}
	
}
