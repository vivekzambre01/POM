package pattern_program;

public class Pattern6 {
	
	public static void main(String[] args) {
		
		int num=1;
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=num;j++) 
			{
			   System.out.print(j+" ");	
			}
			num++;
			System.out.println();
		}
	}
	

}
