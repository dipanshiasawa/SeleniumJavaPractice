package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {

	@Test(dataProvider = "getData")
	private void WebloginCarLoan(String username, String password) {
		//selenium code
		System.out.println("web login car");
		System.out.println(username);
		System.out.println(password);
	}

	@Test(groups= {"Smoke"})
	private void MobileloginCarLoan() {
		//Appium code
		System.out.println("mobile login car");
	}
	
	@Test(timeOut=4000)
	private void MobilesigninCarLoan() {
		//Appium code
		System.out.println("mobile signin car");
	}
	
	@BeforeSuite
	private void beforeSuiteMethod() {
		System.out.println("I will run .... Before Suite - Day 3");

	}
	
	@Test(enabled=false)
	private void MobilesignoutCarLoan() {
		//Appium code
		System.out.println("mobile signout car");
	}
	
	@Test(dependsOnMethods= {"WebloginCarLoan","MobilesigninCarLoan"})
	private void APICarLoan() {
		//API code
		System.out.println("api login car");
	}
	
	@BeforeMethod
	private void beforemethod() {
		System.out.println("I will run .... Before Method - Day 3");

	}
	
	@AfterMethod
	private void aftermethod() {
		System.out.println("I will run .... After Method - Day 3");

	}
	
	@DataProvider
	public Object getData()
	{
		//1st combination - username password - good credit history
		//2nd combination - username password - no credit history
		//3rd - Fraudelent credit history
		
		Object[][] data = new Object[3][2]; //multidimentional array
		
		//1st set
		data[0][0]="firstsetusername";
		data[0][1]="password";
		
		//columns in a row are nothing but value for that particular combination
		//2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		//3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		
		return data;
	}
	
	
}
