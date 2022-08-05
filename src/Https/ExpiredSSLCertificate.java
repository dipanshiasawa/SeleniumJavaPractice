package Https;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExpiredSSLCertificate {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		//options.addExtensions("");
		
		//Set proxy of a site for the browser
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
		
		//Change default download path
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		
		// FirefoxOptions options1 = new FirefoxOptions();

		// options1.setAcceptInsecureCerts(true);

		// EdgeOptions options2 = new EdgeOptions();
		
		//Block popup such as locations on browser
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));
		
		options.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com");
		System.out.println(driver.getTitle());

	}

}
