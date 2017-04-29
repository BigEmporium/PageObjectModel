package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC005_DeleteLead extends LeafTapsWrappers {

	@BeforeClass
	public void setValues() {
		browserName = "chrome";
		testCaseName = "TC005 - Delete Lead";
		testDescription = "Verify the user is able to Delete a Lead";
		category="sanity";
		authors="Gopi";
		dataSheetName = "TC005";
	}
	
	@Test(dataProvider="fetchData")
	public void duplicateLeadPage(String userName, String password) throws InterruptedException
	{
		new LoginPage(driver,test)
		.login(userName, password)
		.clickCRMSFA()
		.clickLeads()
		.clickResultingLead()
		.Delete();
		}
}








