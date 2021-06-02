package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	@Parameters({ "URL" })
	@Test
	public void webCarLoan(String url) {
		System.out.println("Car loan approved");
		System.out.println(url);
	}

	@Parameters({ "URL", "APIKey/Username" })
	@Test
	public void userName(String url, String usrname) {
		System.out.println(usrname);
		System.out.println(url);
	}

}
