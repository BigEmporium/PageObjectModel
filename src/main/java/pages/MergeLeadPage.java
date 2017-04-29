package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.LeafTapsWrappers;

public class MergeLeadPage extends LeafTapsWrappers {
	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test) throws InterruptedException{
		this.driver = driver; 
		this.test = test;
		Thread.sleep(5000);
	}

	public FindMergeLeadPage moveLastWindow() throws InterruptedException{
		switchToLastWindow();
		return new FindMergeLeadPage(driver, test);
	}
	public MergeLeadPage fromlead() {
		clickByXpath(prop.getProperty("MergeLead.fromlead.Xpath"));
		return this;
	}

	public MergeLeadPage tolead() throws InterruptedException {
		Thread.sleep(5000);
		clickByXpath(prop.getProperty("MergeLead.tolead.Xpath"));
		return this;
	}

	public ViewLeadPage clickMergeButton(){
		clickByLink(prop.getProperty("MergeLead.ClickMergeButton.LinkText"));
		acceptAlert();
		return new ViewLeadPage(driver, test);
	}

}