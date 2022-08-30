package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

	@BeforeClass
	private void beforeclassmethod() {
		System.out.println("I will run .... Before Class - Day 1");

	}
	
	@AfterClass
	private void afterclassmethod() {
		System.out.println("I will run .... After Class - Day 1");

	}
	
	@AfterTest
	private void lastExecution() {
		System.out.println("I will run .... After Test - Day 1");

	}
	@Test
	private void Demo() {
		System.out.println("Hello World!");

	}
	@Parameters({"URL"})
	@Test
	public void SecondTest(String urlName) {
		System.out.println("bye");
		System.out.println(urlName);
	}
	
	@AfterSuite
	private void afterSuiteMethod() {
		System.out.println("I will run .... After Suite - Day 1");

	}
}
