import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignement6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver_win32_new\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption2")).click();
		if(driver.findElement(By.id("checkBoxOption2")).isSelected())
		{
			System.out.println(driver.findElement(By.xpath("//label[@for='benz']")).getText());
			String selectedvalue= driver.findElement(By.xpath("//label[@for='benz']")).getText();
		
			Select selectedoption=new Select(driver.findElement(By.id("dropdown-class-example")));
			selectedoption.selectByVisibleText(selectedvalue);
			
			driver.findElement(By.id("name")).sendKeys(selectedvalue);
			driver.findElement(By.id("alertbtn")).click();
			
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
		}

	}

}
