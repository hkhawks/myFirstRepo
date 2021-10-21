package stepDefinitions;

import org.apache.log4j.Logger;
import org.junit.Assert;

import core.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObject;
import utilities.UtilityClass;

public class LoginStepDef extends Base{
	// each step in scenario should have one java method associated with that step.
	// we can't have duplicate methods for step in scenario steps. 
	
	// in order to get access to POM class methods we need to create
	// object of LoginPageObject class
	LoginPageObject loginPageObject = new LoginPageObject();
	
	
	@Given("^user is on Retail website$")
	public void user_is_on_Retail_website() {
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		// Assertion is to verify actual meets the expected
		// if actual does not equal expected value, then execution will stop
		// and test step will fail. 
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		logger.info("Actual Title is matching with expected title");
		
		
	}
	@When("^user click on Myaccount$")
	public void user_click_on_Myaccount() {
		loginPageObject.clickOnMyAccount();
		logger.info("user clicked on MyAccount");
		
	}
	@And("^user click on Login option$")
	public void user_click_on_Login_option() {
		loginPageObject.clickOnLogin();
		logger.info("user clicked on Login Option");
		UtilityClass.takeScreenShot();


	}
	@And("^user enter userName '(.+)' and password '(.+)'$")
	public void user_enter_userName_and_password(String uName, String pass) {
		loginPageObject.enterEmailAndPassword(uName, pass);
		logger.info("user Enter " + uName + "and password " + pass);
		UtilityClass.takeScreenShot();


	}
	@And("^user click on Login Button$")
	public void user_click_login_Button() {
		loginPageObject.clickOnLoginButton();
		logger.info("user click on Login Button");

	}
	@Then("^user should be logged in to Myaccount dashboard$")
	public void user_should_be_logged_in_to_Myaccount_dashboard() {
		// if myAccountText is present it will pass
		// if myAccountText is not present or displayed, it will fail
		Assert.assertTrue(loginPageObject.myAccountTextisPresent());
		logger.info("user is logged in to MyAccount Dashboard");
		UtilityClass.takeScreenShot();


		
	}
}
