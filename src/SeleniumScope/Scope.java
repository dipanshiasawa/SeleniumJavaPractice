package SeleniumScope;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// 1. Give me the count of links on the page.
		// 2. Count of footer section-

		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

//		driver.get("http://qaclickacademy.com/practice.php");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Limiting webdriver scope
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//Limiting the scope again
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		int totalLinks = columnDriver.findElements(By.tagName("a")).size();
		System.out.println(totalLinks);

		/*
		 * List<WebElement> ele =
		 * footerDriver.findElements(By.xpath("//table/tbody/tr/td[1]/ul"));
		 * for(WebElement el1:ele) { // WebElement parent =
		 * el1.findElement(By.xpath("..")); //
		 * System.out.println(parent.getAttribute("innerHTML"));
		 * System.out.println(el1.getAttribute("innerHTML"));
		 * System.out.println("---------------"); WebElement child1=
		 * el1.findElement(By.tagName("li"));
		 * System.out.println(child1.getAttribute("innerHTML"));
		 * System.out.println("-------------------"); }
		 */
		
		//Check if the links are clicking and working
		
		for(int i=1;i<totalLinks;i++)
		{
			String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			
		}
		
/*		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();
		ArrayList<String> handleList = new ArrayList<String>();
		for(int i=0;i<handles.size();i++)
		{
			handleList.add(iterator.next());
		}
		
		for(String hl:handleList)
		{
			driver.switchTo().window(hl);
			System.out.println(driver.getTitle());
		}
*/
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()) {
			driver.switchTo().window(iterator.next());
			System.out.println(driver.getTitle());
		}
		
		
		driver.quit();
	}

}
