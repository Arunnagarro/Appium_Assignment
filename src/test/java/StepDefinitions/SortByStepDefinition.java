package StepDefinitions;

import com.AppiumTesting_Assignment.Pages.RegisterPage;
import com.AppiumTesting_Assignment.Pages.SortByPage;

import BaseTest.BaseClass;
import Hooks.Hook;
import ReusableMethods.ResuableMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SortByStepDefinition extends BaseClass {
	RegisterPage register = new RegisterPage(driver);
	ResuableMethods swipe;
	SortByPage sort = new SortByPage(driver);
	public SortByStepDefinition() {
    	this.driver=Hook.GetDriver(); 	
    }
	@Given("^User Click On Sort By Option$")
	public void user_Click_On_Sort_By_Option() throws Throwable {
	   sort.clickOnSortBy();
	   Thread.sleep(100);
	}

	@Given("^User Select The Option$")
	public void user_Select_The_Option() throws Throwable {
	    sort.clickOnSortOption();
	    swipe = new ResuableMethods(driver);
		logger.info("User select sort option");
		swipe.VerticalSwipeByPercentage(0.50, 0.10, 0.40);
		Thread.sleep(100);
	    Thread.sleep(100);
	}

	@When("^User Select The job$")
	public void user_Select_The_job() throws Throwable {
	   sort.clickOnJob();
	   Thread.sleep(100);
	}

	@Then("^User Click Call To HR$")
	public void user_Click_Call_To_HR() throws Throwable {
	    sort.clickOnCall();
	    Thread.sleep(100);
	}
}
