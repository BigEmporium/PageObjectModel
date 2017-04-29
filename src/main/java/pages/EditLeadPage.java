package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class EditLeadPage extends LeafTapsWrappers {

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		/**if(!verifyTitle(" opentaps CRM")){
			reportStep("This is not Create Lead Page. Look at the SnapShot", "FAIL");
		}**/
	}
	
	public EditLeadPage selectMarketingCampaign(String data) throws InterruptedException{
		selectVisibileTextById(prop.getProperty("EditLead.SelectMarkCampaign.Id"), data);
		Thread.sleep(10000);
		return this;
	}
	
	public EditLeadPage clickaddMark(){
		clickByXpath(prop.getProperty("EditLead.clickaaddMarket.xpath"));
		return this;
	}
	
	public EditLeadPage selectSource(String data1) throws InterruptedException{
		selectVisibileTextById(prop.getProperty("EditLead.SelectSource.Id"),data1); //addDataSourceForm_dataSourceId
		Thread.sleep(10000);
		return this;
	}
	
	public EditLeadPage clickaddSource(){
		//clickByXpath("clickadd.Source.xpath");//(//input[@class="smallSubmit"])[2]
		clickByXpath(prop.getProperty("EditLead.clickaddSource.xpath"));
		return this;
	}
	public ViewLeadPage clickupdate() throws InterruptedException{
		clickByXpath(prop.getProperty("EditLead.clickUpdate.xpath"));//(//input[@class="smallSubmit"])[1]
		return new ViewLeadPage(driver,test);
	}
	
	
}