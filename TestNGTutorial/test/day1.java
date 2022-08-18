package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day1 {

	@BeforeClass
	private void beforeclassmethod() {
		System.out.println("Before class - Day 1");

	}
	
	@AfterClass
	private void afterclassmethod() {
		System.out.println("After class - Day 1");

	}
	
	@AfterTest
	private void lastExecution() {
		System.out.println("I will execute last - Day 1");

	}
	@Test
	private void Demo() {
		System.out.println("Hello World!");

	}
	
	@Test
	public void SecondTest() {
		System.out.println("bye");
	}
	
	@AfterSuite
	private void afterSuiteMethod() {
		System.out.println("After Suite - Day 1");

	}
}
