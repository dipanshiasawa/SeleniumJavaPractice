package SelfPractice;

import java.util.Date;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GetConsoleLog {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Browser_Drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		DesiredCapabilities caps = new DesiredCapabilities();
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.BROWSER, Level.ALL);
        caps.setCapability(ChromeOptions.LOGGING_PREFS , logPrefs);
        
	    options.setCapability(ChromeOptions.CAPABILITY, caps);
	    WebDriver driver = new ChromeDriver(options);
		
	    driver.get("https://dev-app.pompay.me");
	    driver.findElement(By.id("phone_number")).sendKeys("7898894169");
	    driver.findElement(By.xpath("//button[text()='Continue']")).click();
	    
		
	    Thread.sleep(3000);

	        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
	        String otpCode = null;
	        for (LogEntry entry : logEntries) {
	            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
	            //do something useful with the data
	            if(entry.getMessage().contains("verification code"))
	            {
	            	String[] splittedCode = entry.getMessage().split("verification code\" \"");
	            	System.out.println(splittedCode[1]);
	            	System.out.println(splittedCode[1].split("\"")[0]);
	            	otpCode = splittedCode[1].split("\"")[0];
	            	
	            }
	        }
	        driver.findElement(By.className("otp_text_field")).sendKeys(otpCode);
	        
	        driver.quit();

	}

}
