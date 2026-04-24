import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver_win32_new\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Thread.sleep(3000);
		String[] vegs= {"Brocolli","Tomato","Beans"};
	    itemadded(driver,vegs);
	    driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	    driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.cssSelector(".promoBtn")).click();
	    System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
	    driver.close();
	    
	

	}

public static void itemadded(WebDriver driver, String[] vegs)
 {
	int j=0;
	List<WebElement> items= driver.findElements(By.xpath("//h4[@class='product-name']"));
	for(int i=0; i<items.size(); i++)
	{
		List<String> vegslist = Arrays.asList(vegs);
		String name=items.get(i).getText();
		String[] name1=name.split("-");
		String name2=name1[0].trim();
		if(vegslist.contains(name2))
		{
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			j++;
			if(j==vegs.length)
			{
				break;
			}
			
		}

	}
 }
}


