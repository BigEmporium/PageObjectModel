package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.LeafTapsWrappers;

public class TC001_CreateLead extends LeafTapsWrappers {

	@BeforeClass
	public void setValues() {
		browserName = "chrome";
		testCaseName = "TC001 - Create Lead";
		testDescription = "Create Lead in LeafTaps & LogOut";
		category="smoke";
		authors="Gopi";
		dataSheetName = "TC001";
	}

	@Test(dataProvider="fetchData")
	public void createLead(String userName, String password,
			String companyName, String firstName, String lastName,String industry, String ownership) throws InterruptedException{

		new LoginPage(driver,test)
		.login(userName, password)
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.selectIndustry(industry)
		.selectOwnership(ownership)
		.clickCreateLead();		

	}

}











