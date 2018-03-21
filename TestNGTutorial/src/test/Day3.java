package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {
	
// Test GIT
@BeforeClass
public void beforeClass() {
	System.out.println("before executing any method in this class");
}
	@Test
	public void Weblogin () {
		//selenium
		System.out.println("Weblogin");
	}
	@Test
	public void MobileloginCarLoan () {
		//Appium
		System.out.println("MobileloginCarLoan");
	}
	@Test
	public void MobileExecute1 () {
		//Appium
		System.out.println("MobileExecute1");
	}
	@BeforeSuite
	public void bfsuite() {
		System.out.println("BeforeSuite");
	}
	
	@Test
	public void MobileExecute2 () {
		//Appium
		System.out.println("MobileExecute2");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after executing any method in this class");
	}
	@Test
	public void MobileExecute3 () {
		//Appium
		System.out.println("MobileExecute3");
	}
	@Test(dependsOnMethods= {"Weblogin"})
	public void LoginAPICarLoan () {
		//RestAPIAutomation
		System.out.println("LoginAPICarLoan");
	}
}
