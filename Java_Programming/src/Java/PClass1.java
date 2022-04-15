package Java;

public class PClass1 {

	public static void main(String[] args) {
	
		
		int n=1000,  firstTerm=0,  secondTerm=1;
		
		System.out.println("fibonaki series upto "+ n+" ");
		
		while(firstTerm<=n)
		{
			System.out.println(firstTerm+" ");
		
			   int nextTerm = firstTerm+secondTerm;
			           firstTerm=   secondTerm;
			            secondTerm=nextTerm;
		}
		
		
		

	}

}
