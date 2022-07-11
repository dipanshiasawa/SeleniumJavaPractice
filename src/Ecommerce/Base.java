package Ecommerce;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Base {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//IMPLICIT WAIT
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//EXPLICIT WAIT
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//If we have only single item to add in cart
//		String addToCartCucumber = "//h4[@class='product-name' and contains(text(),'Cucumber')]/parent::div/div[@class='product-action']";
//		driver.findElement(By.xpath(addToCartCucumber)).click();
		
		//If we have multiple items to be added in the cart
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
		addItems(driver, itemsNeeded);
		
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		
		driver.findElement(By.xpath("//div[@class='action-block']/button")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
		
		String promoSuccess = driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		
		System.out.println(promoSuccess);
		
		Assert.assertEquals(promoSuccess, "Code applied ..!");
		
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		
		
		
		
		
		
		

//		driver.quit();
	}
	
	public static void addItems(WebDriver driver, String[] itemsNeeded)
	{
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		//Format name to get actual vegetable name
		//Convert array into arraylist at runtime because arraylist take large memory compared to array while compiling
		//Check whether name you extracted present in arrayList or not
		
		List itemsNeededList = Arrays.asList(itemsNeeded);
		int counter = 0;
		for(int i=0 ; i<products.size() ; i++)
		{
			String name = products.get(i).getText().split("-")[0].trim();
			
					
			if(itemsNeededList.contains(name))
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				counter++;
				if(itemsNeeded.length == counter)
				{
					break;
				}
			}
		}
	}

}
