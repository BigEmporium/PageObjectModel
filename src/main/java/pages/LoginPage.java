package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import wrappers.LeafTapsWrappers;

public class LoginPage extends LeafTapsWrappers{

	public LoginPage(RemoteWebDriver driver,ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("Opentaps Open Source ERP + CRM"))
			reportStep("This is not Login Page", "FAIL");

	}
	//This is the enter username
	public LoginPage enterUserName(String data) {
		enterById("username", data);
		return this;

	}
	//This is the enter password
	public LoginPage enterPassword(String data) {
		enterById("password", data);
		return this;
	}
	//This is the click login
	public HomePage clickLogin() {
		clickByClassName("decorativeSubmit");
		return new HomePage(driver,test);		
	}
	//This is the click login for failure
	public LoginPage clickLoginForFailure() {
		clickByClassName("decorativeSubmit");
		return this;
		
	}
	
	public LoginPage verifyErrorMessage(String data) {		
		verifyTextContainsByXpath("//*[@id='errorDiv']", data);		
		return this;		
	}
	
	public HomePage login(String userName, String password){
		return enterUserName(userName).enterPassword(password).clickLogin();
	}
	
	
	




















}





