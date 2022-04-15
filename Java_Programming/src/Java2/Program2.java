package Java2;

public class Program2 {

	public static void main(String[] args) {
		
		number(1, 200,50);
		//printnum(20);
	}
		
	public static void number(int stnum, int endnum, int stop)
	{
		if(stnum<=endnum&&stnum<=stop)
		{
			System.out.println(stnum);
		stnum++;
			number(stnum,endnum,stop);
			
			
			
		}
	}
	public static void printnum(int num) 
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			printnum(num);
		}
	}
		
		
		
		
		
}

