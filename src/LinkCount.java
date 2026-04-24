import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver_win32_new\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		//1. finding count of links in a page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2. finding count of links at the bottom of the page
		WebElement bottomelement=driver.findElement(By.id("gf-BIG"));
		System.out.println(bottomelement.findElements(By.tagName("a")).size());
		
		//3. finding count of links present in bottom column
		WebElement coulmnelement=driver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
		System.out.println(coulmnelement.findElements(By.tagName("a")).size());
		
		//4. click on each link in the column and check if the pages are opening along with title of the page
		for(int i=1;i<coulmnelement.findElements(By.tagName("a")).size();i++)
		{
			String clickonlink= Keys.chord(Keys.CONTROL, Keys.ENTER);
			coulmnelement.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			Thread.sleep(5000);
			
		}
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}
	}

}
