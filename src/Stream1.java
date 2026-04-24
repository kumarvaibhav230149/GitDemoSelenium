import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class Stream1 {

	public static void main(String args [])
	{
		
	}
	@Test
	public void name()
	{
		ArrayList<String> names = new ArrayList<String>() ;
		names.add("Sam");
		names.add("Balram");
		names.add("Rama");
		names.stream().forEach(s->System.out.println(s));
			
	}
	@Test
	public void sum()
	{
		List<String> names1=Arrays.asList("Ram","Sam","Alekhya","Alexa");
		names1.stream().filter(s->s.endsWith("a")).sorted().forEach(s->System.out.println(s));
		
	}
}
