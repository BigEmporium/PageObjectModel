package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class ViewLeadPage extends LeafTapsWrappers {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not View Lead Page. Look at the SnapShot", "FAIL");
		}
	}

	public ViewLeadPage readFirstName()
	{
		getTextById(prop.getProperty("ViewLead.Fname.Id"));
		return this;
	}
	public ViewLeadPage readSources()
	{
		getTextById(prop.getProperty("ViewLead.Source.Id"));
		return this;
	}
	public ViewLeadPage readMarketingCampaign()
	{
		getTextById(prop.getProperty("ViewLead.MCampaign.Id"));
		return this;
	}
	public EditLeadPage Edit()
	{
		clickByLink(prop.getProperty("ViewLead.Edit.Link"));
		return new EditLeadPage(driver,test);
	}
	public DeleteLeadPage Delete()
	{
		clickByLink(prop.getProperty("ViewLead.Delete.Link"));
		return new DeleteLeadPage(driver,test);
	}
	public DuplicateLeadPage Duplicate()
	{
		clickByLink(prop.getProperty("ViewLead.Duplicate.Link"));
		return new DuplicateLeadPage(driver, test);
		
	}
}
