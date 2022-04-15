package JavaStream;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Streams {
	public static void main(String[] args) {
	}
	
	//	@Test
		public int regular()
		{
		ArrayList<String>  al=new ArrayList<String>();
		
		al.add("Atul");
		al.add("Sapana");
		al.add("Naveen");
		al.add("Anita");
		al.add("Archana");
	int count =0;
		for (int i=0;i<al.size();i++)
		{
			  String actual = al.get(i);
			  if(actual.startsWith("A"))
			  {
				  count++;
			  }
		}
		System.out.println(count);
		return count++;
	}
	@Test
	public void streamfilter()
	{
		ArrayList<String>  names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Atul");
		names.add("Amol");
		names.add("priyanka");
		names.add("Akashay");
		
		Long c=names.stream().filter(s-> s.startsWith("A")).count();
		System.out.println(c);
		
	}
	
}

