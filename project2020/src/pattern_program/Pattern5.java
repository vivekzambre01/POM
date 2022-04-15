package pattern_program;

public class Pattern5 {
	
	
	public static void main(String[] args) {
		
		int num=1;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=num;j++) {
				System.out.print(i+" ");
			}
			num++;
			System.out.println();
		}
	}

}
