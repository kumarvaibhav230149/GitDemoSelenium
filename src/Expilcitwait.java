import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expilcitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver_win32_new\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		WebDriverWait wait= new WebDriverWait(driver,5);
		Thread.sleep(3000);
		String[] vegs= {"Brocolli","Tomato","Beans"};
	    itemadded(driver,vegs);
	    driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	    driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
	    driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.cssSelector(".promoBtn")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
	    System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
	    //driver.close();
	    
	

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


