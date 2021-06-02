package test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_demo {

	
	@Test(dataProvider="getData")
	public void Demo(String username, String password) 
	{
		System.out.println(username);
		System.out.println(password);
	}
	// Sending multiple data sets to any method
	@DataProvider
	public Object[][] getData() {
		// 1st combination -username password - good credit history
		// 2nd combinaton - username password - frodulant credit history
		// 3rd combination - username password - No credit history

		Object[][] data = new Object[3][2];
		// Set 1
		data[0][0] = "firstSetUsername";
		data[0][1] = "firstSetPassword";
		// Columns in the row are nothing but the values for that particular
		// combinations(row).
		// Set 2
		data[1][0] = "secondSetUsername";
		data[1][1] = "secondSetPassword";
		// Set 3
		data[2][0] = "thirdSetUsername";
		data[2][1] = "thirdSetPassword";

		return data;
	}
}