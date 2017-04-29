package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.LoginPage;
import pages.MyLeadsPage;
import pages.FindMergeLeadPage;
import pages.MergeLeadPage;
import wrappers.LeafTapsWrappers;

public class TC003_MergeLead extends LeafTapsWrappers {

	@BeforeClass
	public void setValues() {
		browserName = "chrome";
		testCaseName = "TC003 - Merge Lead";
		testDescription = "MergeLead";
		category="sanity";
		authors="Babu";
		dataSheetName = "TC003";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String userName, String password,
			String fromname,String toname) throws InterruptedException{

		new LoginPage(driver,test)
		.login(userName, password)
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLead()
		.fromlead()
		.moveLastWindow()
		.clickLead(fromname)
		.moveToParentWindow()
		.tolead()
		.moveLastWindow()
		.clickLead(toname)
		.moveToParentWindow()
		.clickMergeButton();
		
	}
	

}











