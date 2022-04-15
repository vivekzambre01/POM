package Array;

public class Two_Diamensional_Loop {

	public static void main(String[] args) {
		
		int [][] a= {{1,2,3},{4,5,6}};
//		System.out.println("the size and length of the two diamensional array:"+a.length);
//		System.out.println("the size and length of the first one diamensional array"+a[0].length);
//		System.out.println("The size and Length of the second diamensional array"+a[1].length);
		
		//for loop for two diamensional array
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[1].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();			
		}
	}
	}
    