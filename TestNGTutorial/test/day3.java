package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {

	@Test
	private void WebloginCarLoan() {
		//selenium code
		System.out.println("web login car");
	}

	@Test(groups= {"Smoke"})
	private void MobileloginCarLoan() {
		//Appium code
		System.out.println("mobile login car");
	}
	
	@Test
	private void MobilesigninCarLoan() {
		//Appium code
		System.out.println("mobile signin car");
	}
	
	@BeforeSuite
	private void beforeSuiteMethod() {
		System.out.println("Before Suite - Day 3");

	}
	
	@Test
	private void MobilesignoutCarLoan() {
		//Appium code
		System.out.println("mobile signout car");
	}
	
	@Test
	private void LoginAPICarLoan() {
		//API code
		System.out.println("api login car");
	}
	
	@BeforeMethod
	private void beforemethod() {
		System.out.println("Before every method");

	}
	
	@AfterMethod
	private void aftermethod() {
		System.out.println("After every method");

	}
}
