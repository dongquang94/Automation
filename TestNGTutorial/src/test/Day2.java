package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@AfterTest
	public void lastestexecution() {
		System.out.println("After test execution");
	}
	@Test(groups= {"Smoke"})
	public void loan() {
		System.out.println("good");
	}
	@BeforeTest
	public void beforeTestExecution(){
		System.out.println("Before Test execution");
	}
}
