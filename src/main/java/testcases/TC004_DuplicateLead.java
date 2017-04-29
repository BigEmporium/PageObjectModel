package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC004_DuplicateLead extends LeafTapsWrappers {

	@BeforeClass
	public void setValues() {
		browserName = "chrome";
		testCaseName = "TC004 - Duplicate Lead";
		testDescription = "Verify the user is able to duplicate a Lead";
		category="sanity";
		authors="Babu";
		dataSheetName = "TC004";
	}
	
	@Test(dataProvider="fetchData")
	public void duplicateLeadPage(String userName, String password) throws InterruptedException
	{
		new LoginPage(driver,test)
		.login(userName, password)
		.clickCRMSFA()
		.clickLeads()
		.clickResultingLead()
		.Duplicate()
		.enterDescription()
		.clickUpdateButton();
	}
}
