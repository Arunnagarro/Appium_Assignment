package StepDefinitions;

import java.net.MalformedURLException;

import com.AppiumTesting_Assignment.Pages.RegisterPage;
import com.AppiumTesting_Assignment.Pages.SearchPage;
import com.AppiumTesting_Assignment.Utility.CommonUtils;

import BaseTest.BaseClass;
import Hooks.Hook;
import ReusableMethods.ResuableMethods;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SearchStepDefinitions extends BaseClass {
	
	SearchPage search = new SearchPage(driver);
	RegisterPage register = new RegisterPage(driver);
	ResuableMethods swipe;
	public SearchStepDefinitions() {
    	this.driver=Hook.GetDriver(); 	
    }
	@Given("^User Click on search tab$")
	public void user_Click_on_search_tab() throws Throwable 
	{
	   search.clickSearch();
	   logger.info("Search job");
	   Thread.sleep(1000);
	}

	@When("^User enter City Delhi$")
	public void user_enter_City_Delhi() throws Throwable 
	{
		search.EnterCityName("Bank Office");
		logger.info("Enter on saerch bar");
		Thread.sleep(1000);
	}

	@When("^Open Searched job$")
	public void open_Searched_job() throws Throwable
	{
	   search.ClickOnJob();
	   Thread.sleep(100);
	}

	@Then("^Add job to favourite$")
	public void add_job_to_favourite() throws Throwable 
	{
	    search.AddToFavourite();
	    logger.info("Add to favourite");
	    Thread.sleep(100);
	}

}
