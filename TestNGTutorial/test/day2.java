package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test
	private void ploan() {
		System.out.println("good");

	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will execute first - Day 2");
	}
	
	@AfterTest
	private void lastExecution() {
		System.out.println("I will execute last - Day 2");

	}
}
