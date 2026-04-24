import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stream3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\Downloads\\chromedriver_win32_new\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//th[1]")).click(); 
		
		List<String > sortedList;
		do {
			List<WebElement> elementList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		//List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		sortedList = elementList.stream().filter(s->s.getText().contains("Rice")).map(s->price(s))
				.collect(Collectors.toList());
		sortedList.stream().forEach(s->System.out.println(s));
		if(sortedList.size()<1){
			driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			
		}
		}while(sortedList.size()<1);

	}

	private static String price(WebElement s) {
		// TODO Auto-generated method stub
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
