import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_first {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("panchal");
		driver.findElement(By.name("inputPassword")).sendKeys("inputPassword");
		driver.findElement(By.cssSelector("button[type='submit'")).click();
		System.out.println(driver.findElement(By.className("error")).getText());
		//driver.findElement(By.xpath("//div/a")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("chaman");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("cdx@vfc.co");
		//driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("7654432154");
		driver.findElement(By.xpath("//button[text()=\"Reset Login\"]")).click();
		System.out.println();driver.findElement(By.xpath("//form/p")).getText();
		String text= driver.findElement(By.xpath("//form/p")).getText();
		String text1[] = text.split("'");
		System.out.println(text1[1]);
		
		
		
	}
		

}