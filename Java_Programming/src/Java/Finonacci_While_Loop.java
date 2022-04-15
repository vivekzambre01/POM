package Java;

public class Finonacci_While_Loop {

	public static void main(String[] args) {
	
		
		int n=100, firstTerm = 0, secondTerm= 1;
		 System.out.println("fibonacci series upto "+ n+ " ");
		 
		 while(firstTerm<=n) {
			 System.out.println(firstTerm+" ");
			 
			 int nextTerm = firstTerm+secondTerm;
			 firstTerm =secondTerm;
			 secondTerm = nextTerm;
			 
		 }
	}

}
