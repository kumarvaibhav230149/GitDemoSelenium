import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver_win32_new\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor jr=(JavascriptExecutor)driver;
		jr.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		jr.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> scroll= driver.findElements(By.xpath("//fieldset/div/table/tbody/tr/td[4]"));
		int sum = 0;
		for(int i=0; i<scroll.size();i++)
		{
			//int value = Integer.parseInt(scroll.get(i).getText());
			sum = sum + Integer.parseInt(scroll.get(i).getText());
			//System.out.println(scroll.get(i).getText());
		}
		String value=driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
		Assert.assertEquals(value,sum);
	}

}
