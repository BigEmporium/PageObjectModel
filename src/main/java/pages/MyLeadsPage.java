package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MyLeadsPage extends LeafTapsWrappers {

	public MyLeadsPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
	}


	public CreateLeadPage clickCreateLead() throws InterruptedException
		{
			clickByLink(prop.getProperty("MyLead.CreateLead.Link"));
			return new CreateLeadPage(driver,test);
		}

	public ViewLeadPage clickResultingLead()
	{
		clickByXpath(prop.getProperty("MyLead.FirstResultingLead.xpath"));
		return new ViewLeadPage(driver,test);
	
	}
	
	public MergeLeadPage clickMergeLead() throws InterruptedException {
		clickByLink(prop.getProperty("MergeLead.ClickMergeLeads.Linktext"));
		return new MergeLeadPage(driver, test);
	}
}
	
	























