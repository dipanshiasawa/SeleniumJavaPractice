package ElementTechnique;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUpdated {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		//April 23
		
		driver.findElement(By.xpath("//*[@id='travel_date']")).click();
		//Month selection
//		Thread.sleep(5000);
		WebElement datePicker = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));
		String month = datePicker.getText();
		
		while(!month.contains("May"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
			month = datePicker.getText();
		}

		//Date selection
		List<WebElement> dates = driver.findElements(By.className("day"));
		int count = dates.size();
		
		for(int i=0;i<count;i++)
		{
			String text = dates.get(i).getText();
			
			if(text.equalsIgnoreCase("21"))
			{
				dates.get(i).click();
				break;
			}
		}
		

	}

}
