import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayOfCart1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver_win32_new\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		int j=0;
		String[] vegs= {"Brocolli","Tomato","Beans"};
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


