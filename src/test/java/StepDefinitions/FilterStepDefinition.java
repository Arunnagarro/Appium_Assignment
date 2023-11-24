package StepDefinitions;

import java.net.MalformedURLException;

import com.AppiumTesting_Assignment.Pages.FilterPage;
import com.AppiumTesting_Assignment.Utility.CommonUtils;

import BaseTest.BaseClass;
import Hooks.Hook;
import ReusableMethods.ResuableMethods;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FilterStepDefinition extends BaseClass
{
	FilterPage Filter = new FilterPage(driver);;
	ResuableMethods swipe;
	public FilterStepDefinition() {
    	this.driver=Hook.GetDriver(); 	
    }
	
	
	
	@Given("^User Click On Filter Options$")
	public void user_Click_On_Filter_Options() throws Throwable 
	{
	   Filter.clickOnFilters();
	   Thread.sleep(100);   
	}
	@Given("^User Click on Other Option$")
	public void user_Click_on_Other_Option() throws Throwable
	{
	   Filter.clickOtherOption();
	   swipe = new ResuableMethods(driver);
	   swipe.VerticalSwipeByPercentage(0.60, 0.20, 0.50);
	   Thread.sleep(100);
	}
	@Given("^User Choose the option and Submit$")
	public void user_Choose_the_option_and_Submit() throws Throwable
	{
	 
		System.out.println("SearchJob");
		Thread.sleep(100);
	}
	@When("^User Select Fresher$")
	public void user_Select_Fresher() throws Throwable 
	{
	  Filter.ChooseFresher();
	  Thread.sleep(100);
	}
	@Then("^User Click Apply$")
	public void user_Click_Apply() throws Throwable
	{
	  Filter.clickOnApply();
	  Thread.sleep(100);
	}
	@Then("^User Open the searcher job$")
	public void user_Open_the_searcher_job() throws Throwable
	{
	   Filter.clickOnjOB();
	   Thread.sleep(100);
	}

}
