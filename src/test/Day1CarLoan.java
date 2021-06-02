package test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1CarLoan {

	@Test
	public void webCarLoan() {
		System.out.println("webCarLoan");
		Assert.assertTrue(false);
	}
	
	@Test(groups= {"Smoke"})
	public void mobileCarLoan() {
		System.out.println("mobileCarLoan");
		
	}
	@AfterSuite
	public void afSuite() {
		System.out.println("I am executing at the END");
	}
	@Test(dependsOnMethods= {"webCarLoan"})
	public void apiCarLoan() {
		System.out.println("apiCarLoan");
		
	}
	
	@AfterTest
	public void last() {
		System.out.println("I will execute at last");
		
	}
}
