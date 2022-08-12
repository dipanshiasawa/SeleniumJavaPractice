package JavaStreams;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#");
		driver.findElement(By.cssSelector("[href*='offers']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		
		//Click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		
		//Capture all elements into list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		
		//Capture text of all the webelements in a list(original)
		List<String> veggies = elementsList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//Sort the original list in step 3 -> sorted list
		List<String> sortedList = veggies.stream().sorted().collect(Collectors.toList());
		
		//Compare original list and sorted list
		Assert.assertEquals(sortedList, veggies);
		
		
		//scan the column with getText -> Rice -> print price of Rice
		List<String> price ;
		do
		{
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s->s.getText().contains("Rice")).map(s->getVeggiePrice(s)).collect(Collectors.toList());
			price.forEach(s->System.out.println(s));
		
			if(price.size()<1)
			{
				driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
			}
		
		}while(price.size()<1);
		
		
		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> searchList = driver.findElements(By.xpath("//tr/td[1]"));
		List<WebElement> filterList = searchList.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
		
		Assert.assertEquals(searchList, filterList);
		
		
	}

	private static String getVeggiePrice(WebElement s) {

		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
