

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
	}
	
	@Test
	public void Mobilecharger()
	{
		System.out.println("Mobile Charger name");
	}
	
}
