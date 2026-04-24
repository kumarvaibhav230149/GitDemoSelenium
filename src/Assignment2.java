import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Rahulshetty@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		WebElement dropdown1 = (WebElement) driver.findElement(By.id("exampleFormControlSelect1"));
		Select gender= new Select(dropdown1);
		//Thread.sleep(3000);
		gender.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("11/29/1997");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
	    driver.close();

	}

}
