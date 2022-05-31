package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("dipanshi");
		driver.findElement(By.name("inputPassword")).sendKeys("test");
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");;
		driver.findElement(By.cssSelector("input[placeholder='Email'")).sendKeys("asdf@email.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@email.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567890");
		
		
		
	}

}
