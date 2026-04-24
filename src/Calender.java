import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver_win32_new\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Date of travel']")).click();
		while(!driver.findElement(By.xpath("//div[@class='flatpickr-month'] //div[@class='flatpickr-current-month']")).getText().contains("April"))
		{
			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();
		}
		
		List<WebElement> dates= driver.findElements(By.cssSelector(".dayContainer"));
		for(int i=0;i<dates.size();i++)
		{
			if(driver.findElements(By.cssSelector("flatpickr-day ")).get(i).getText().equalsIgnoreCase("23"))
			{
				driver.findElements(By.cssSelector("flatpickr-day ")).get(i).click();
			}
			
		}
	}

}
