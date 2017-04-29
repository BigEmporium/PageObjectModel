package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class FindLeadPage extends LeafTapsWrappers {

	public FindLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("Find Leads | opentaps CRM")){
			reportStep("This is not Find Lead Page. Look at the SnapShot", "FAIL");
		}
	}

	public FindLeadPage enterbyfirstname(String data) {
		enterByXpath(prop.getProperty("FindLeadPage.FirstName.xpath"), data);
		return this;

	}
	
	public FindLeadPage clickfindleadsbutton() throws InterruptedException {
		clickByXpath(prop.getProperty("FindLeadPage.FindLeadsButton.xpath"));
		Thread.sleep(3000);
		return this;
	}
	
	public FindLeadPage selectphonetab(){
		clickByXpath(prop.getProperty("FindLeadPage.PhoneTab.xpath"));
		return this;
	}
	
	public FindLeadPage enterbyphonenumber(String data) {
		enterByXpath(prop.getProperty("FindLeadPage.PhoneNumber.xpath"), data); //
		return this;
	}
	
	public ViewLeadPage clickfirstresultinglead(){
		clickByXpath(prop.getProperty("FindLeadPage.FirstResultingLead.xpath"));
		return new ViewLeadPage(driver,test);
	}
	public FindLeadPage no_recordsfound(String data){
		verifyTextContainsByXpath(prop.getProperty("FindLeadPage.NoRecordsfound.xpath"), data);
		return this;
	}
	
}