package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2HomeLoan {

	//Use @BeforeTest to prioritize that test cases.
	
	@Test(groups= {"Smoke"})
	public void webHomeLoan() {
		System.out.println("webHomeLoan");
	}

	@AfterMethod
	public void afEveryTest() {
		System.out.println("I will execute after each test method in a class");
	}
	
	@Test(enabled=false)        //this test will be excluded and will not be shown in report as well. Mainly used for known failed test cases.
	public void mobileHomeLoan() {
		System.out.println("mobileHomeLoan");
		
	}
	@BeforeSuite
	public void bfSuite() {
		System.out.println("I am executing at highest priority");
	}
	
	@Test(groups= {"Smoke"})
	public void apiHomeLoan() {
		System.out.println("apiHomeLoan");
		
	}
	
	@BeforeTest
	public void first() {
		System.out.println("I will execute first");
	}
	
	@BeforeMethod
	public void bfEveryTest() {
		System.out.println("I will execute before each Test/method in Day2HomeLoan class");
	}
	
	@BeforeClass
	public void bfClass() {
		System.out.println("Before executing any Test/method in a class");
	}
	
	@AfterClass
	public void afClass() {
		System.out.println("After executing all Tests/methods in a class");
	}
}
