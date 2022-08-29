package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day4 {

	@Test
	private void WebloginHomeLoan() {
		//selenium code
		System.out.println("web login home");
	}

	@Test(groups= {"Smoke"})
	private void MobileloginHomeLoan() {
		//Appium code
		System.out.println("mobile login home");
	}
	
	@Test
	private void LoginAPIHomeLoan() {
		//API code
		System.out.println("api login home");
	}
	
	@BeforeTest
	public void prerequisite2()
	{
		System.out.println("I will execute first - Day 4");
	}
}
