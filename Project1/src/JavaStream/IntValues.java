package JavaStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class IntValues {

	public static void main(String[] args) {
		
	}
	     @Test
		public void SortingArray()
		{
		List<Integer>values=Arrays.asList(3,5,1,5,5,5,5,5);
		values.stream().distinct().forEach(s->System.out.println(s));
		  List<Integer> li=values.stream().distinct().sorted().collect(Collectors.toList());
		  System.out.println(li.get(2));
		  
		  
		}

}

