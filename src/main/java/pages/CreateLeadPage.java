package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class CreateLeadPage extends LeafTapsWrappers {


	public CreateLeadPage(RemoteWebDriver driver, ExtentTest test) throws InterruptedException{
		this.driver = driver; 
		this.test = test;

		Thread.sleep(5000);
		if(!verifyTitle("Create Lead | opentaps CRM")){
			reportStep("This is not Create Lead Page. Look at the SnapShot", "FAIL");
		}
	}

	public CreateLeadPage enterCompanyName(String data) {
		enterById(prop.getProperty("CreateLead.Company.Id"), data);
		return this;

	}

	public CreateLeadPage enterFirstName(String data) {
		enterById(prop.getProperty("CreateLead.FirstName.Id"), data);
		return this;
	}

	public CreateLeadPage enterLastName(String data) {
		enterById(prop.getProperty("CreateLead.LastName.Id"), data);
		return this;
	}

	public ViewLeadPage clickCreateLead(){
		clickByName(prop.getProperty("CreateLead.CreateLead.Name"));
		return new ViewLeadPage(driver,test);
	}

	public CreateLeadPage selectIndustry(String data)
	{
		selectVisibileTextById(prop.getProperty("CreteLead.Industry.Id"),data);
		return this;
	}
	public CreateLeadPage selectOwnership(String odata)
	{
		selectVisibileTextById(prop.getProperty("CreateLead.Ownship.Id"),odata);
		return this;
	}























}
