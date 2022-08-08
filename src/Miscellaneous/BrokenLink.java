package Miscellaneous;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		//Broken link
		//Step 1 - to get all the URLs of the links using selenium
		//Java methods call URLs and get the status code
		//If status code is greater than 400, url is broken
		
		/*
		String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		
		HttpURLConnection conn =  (HttpURLConnection) new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode = conn.getResponseCode();
		System.out.println(respCode);
		*/
		
		SoftAssert softAssert = new SoftAssert();
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link : links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn =  (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			//hard assert
			//Assert.assertTrue(respCode<400, "The link with text '"+link.getText()+"' is broken with code "+respCode);
			//soft assert
			softAssert.assertTrue(respCode<400, "The link with text '"+link.getText()+"' is broken with code "+respCode);
			
		}
		
		softAssert.assertAll();

	}

}
