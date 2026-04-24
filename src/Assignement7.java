import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver_win32_new\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> rows=driver.findElements(By.xpath("//div/fieldset/table/tbody/tr"));
		System.out.println(rows.size());
		List<WebElement> columns=driver.findElements(By.xpath("//div/fieldset/table/tbody/tr/th"));
		System.out.println(columns.size());
		System.out.println(driver.findElement(By.xpath("//div/fieldset/table/tbody/tr[3]")).getText());
	}

}
