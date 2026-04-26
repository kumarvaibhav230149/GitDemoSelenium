

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1 {

	@Test
	public void name()
	{
		System.out.println();
	}
	
	@BeforeTest
	public void first()
	{
		System.out.println("Test execution from Before Test");
	}
	@Test
	public void Mobilename()
	{
		System.out.println("Mobile name");
		System.out.println("Browser name");
		System.out.println("Application name");

	}
	
	@Test
	public void Mobilecharger()
	{
		System.out.println("Mobile Charger name");
		
		System.out.println("Mobile Charger name234");
		
		System.out.println("Mobile Charger name6546");
		
	}
	
}
