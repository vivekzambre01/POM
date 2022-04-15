package Array;

public class Three_Diamensional_Loop {
	
	public static void main(String[] args) {
		int a[][][]= {{{1,2,3,4},{4,5,6,7},{5,6,8,9}},{{1,4,5,8},{7,8,8,7},{8,8,9,7}}};
		
System.out.println("the number of three diamensional array"+" "+a.length);
System.out.println("The number of single Diamensional array in the first three diamensional array are"+a[0].length);
System.out.println("The number of single diamensional array int the second three diamensional array are "+a[1].length);
System.out.println("The number of single diamensional array int the second three diamensional array are "+a[0][0].length);
	
for(int [][] tempone:a)
{
	for(int [] temptwo:tempone) 
	{
	for(int tempthree:temptwo)
	{
		System.out.print(tempthree+" ");
	}
	System.out.println();
}
	System.out.println();






	
}
















	}

	
	
}
