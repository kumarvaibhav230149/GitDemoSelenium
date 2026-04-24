import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver_win32_new\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		List<WebElement> options= driver.findElements(By.id("autocomplete"));
		for(int i=0;i<options.size();i++)
		{
			String option= options.get(i).getText();
			if(option.equalsIgnoreCase("india"))
			{
				options.get(i).click();
				break;
			}
			
		}

	}

}
