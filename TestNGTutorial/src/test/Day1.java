package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Day1 {

	@Test
	public void FirstTestcase() {
		System.out.println("firstTestcase");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("After suite");
	}

	@Test
	public void SecondTestcase() {
		System.out.println("secondTestcase");
	}
}
