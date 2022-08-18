package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

	
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
}
