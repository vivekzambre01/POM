package Java2;

public class Program3 {

	public static void main(String[] args) {
		
		number(1,200,30);
	}
		
		public static void number(int stnum, int endnum, int stop)
		{
			for(int i=stnum;i<=endnum;stnum++)
				
		//	if(stnum<=endnum&&stnum<=stop)
				
			{
				System.out.println(stnum);
			 //   stnum++;
				number(stnum,endnum,stnum);
				
	}

}
	}

