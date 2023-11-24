package StepDefinitions;

import com.AppiumTesting_Assignment.Pages.RegisterPage;
import com.AppiumTesting_Assignment.Pages.ViewProfilePage;

import BaseTest.BaseClass;
import Hooks.Hook;
import ReusableMethods.ResuableMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ViewProfileStepDefinition extends BaseClass {
	ViewProfilePage profile = new ViewProfilePage(driver);
	RegisterPage register = new RegisterPage(driver);
	ResuableMethods swipe;
	public ViewProfileStepDefinition()
	{
    	this.driver=Hook.GetDriver(); 	
    }
	@Given("^User Click on profile$")
	public void user_Click_on_profile() throws Throwable
	{
	    profile.ClickProfile();
	    logger.info("User open Profile");
	    Thread.sleep(100);
	}
	@Given("^click on my profile$")
	public void click_on_my_profile() throws Throwable 
	{
		profile.ClickMyProfile();
		swipe = new ResuableMethods(driver);
		logger.info("User open MyProfile");
		swipe.VerticalSwipeByPercentage(0.60, 0.20, 0.50);
		Thread.sleep(100);
	}
	@When("^User click on fill language$")
	public void user_click_on_fill_language() throws Throwable
	{
	    profile.ClickLanguageFill();
	    logger.info("User UpdateProfile");
	    Thread.sleep(100);
	}
	@Then("^user select the language and click submit$")
	public void user_select_the_language_and_click_submit() throws Throwable
	{
	    profile.chooseEnglishLanguage();
	    profile.cickSubmitl();
	    Thread.sleep(100);
	}
	@Then("^click update$")
	public void click_update() throws Throwable 
	{
		profile.ClickBack();
		Thread.sleep(100);   
	}
}
