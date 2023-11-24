package StepDefinitions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeMethod;

import com.AppiumTesting_Assignment.Pages.RegisterPage;
import com.AppiumTesting_Assignment.Utility.CommonUtils;

import BaseTest.BaseClass;
import Hooks.Hook;
import ReusableMethods.ResuableMethods;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDefinition extends BaseClass {
	RegisterPage register;
	ResuableMethods swipe;
    public RegisterStepDefinition() {
    	this.driver=Hook.GetDriver(); 	
    }
	@Given("^App Lauch$")
	public void app_Lauch() throws Throwable {
		register = new RegisterPage(driver);
	}
	@And("^User Enters The NameArun$")
	public void user_Enters_The_NameArun() throws Throwable {
	   register.EnterName("Arun");
	   logger.info("User Enter The Name");
	   Thread.sleep(100);
	}
	@And("^User Enters The Phone Number(\\d+)$")
	public void user_Enters_The_Phone_Number(String arg1) throws Throwable {
		register.enterPhoneNumber(arg1);
		logger.info("User Enter The Phone Number");  
	}
	@When("^User Click Submit$")
	public void user_Click_Submit() throws Throwable {
		register.click_submitbutton();
		Thread.sleep(10000);
	}
	@Then("^User Select city$")
	public void user_Select_city() throws Throwable {
	    register.clickCityButton();
	    Thread.sleep(100);
	}
	@Then("^user Enter LocationSadar Bazar$")
	public void user_Enter_LocationKamruddin_Nagar() throws Throwable {
	   register.entercity("Kamruddin Nagar");
	   Thread.sleep(100);
	}
	@Then("^User Click SubmitButton$")
	public void user_Click_SubmitButton() throws Throwable {
	   register.clickSubmit();
	   Thread.sleep(100);
	}
	@Then("^User Select gender$")
	public void user_Select_gender() throws Throwable {
	   register.chooseGender();
	   Thread.sleep(100);
	}
	@Then("^User Select Qualification$")
	public void user_Select_Qualification() throws Throwable {
	   register.chooseQualifications();
	   Thread.sleep(100);
	}
	@Then("^User Select SchoolMedium$")
	public void user_Select_SchoolMedium() throws Throwable {
	    register.chooseSchoolMedium();
	    Thread.sleep(100);
	}
	@Then("^User Select EnglishLevel$")
	public void user_Select_EnglishLevel() throws Throwable {
	   register.chooseEnglishLevel();
	   swipe = new ResuableMethods(driver);
	   swipe.VerticalSwipeByPercentage(0.80, 0.20, 0.50);
	   Thread.sleep(100);
	}
	@Then("^User scroll and Select Exper Or Fresher$")
	public void user_scroll_and_Select_Exper_Or_Fresher() throws Throwable {
		register.chooseExperOrFresher();
		Thread.sleep(100);
	}
	@Then("^User Click Age$")
	public void user_Click_Age() throws Throwable {
		 register.clickAge();
		 Thread.sleep(100);
	}
	@Then("^User Select Age$")
	public void user_Select_Age() throws Throwable {
	    register.chooseAge();
	    swipe = new ResuableMethods(driver);
	    Thread.sleep(100);
	}
	@Then("^User Select Interest$")
	public void user_Select_Interest() throws Throwable {
	    register.chooseInterest();
	    Thread.sleep(100);
	}
	@Then("^User click Submit Option$")
	public void user_click_Submit_Option() throws Throwable {
	    register.clickSubmitOption();
	    Thread.sleep(100);
	}
	@Then("^user Click on What You Know$")
	public void user_Click_on_What_You_Know() throws Throwable {
	   register.clickFillForm();
	   Thread.sleep(100);
	}

	@Then("^user choose the options$")
	public void user_choose_the_options() throws Throwable {
		register.chooseWhatYouKnow();
		register.chooseWhatYouKnow1();
		Thread.sleep(100);
	}

	@Then("^user click Submito$")
	public void user_click_Submito() throws Throwable {
		register.clickSubmitO();
		Thread.sleep(100);
	}

	@Then("^User click on Degree and Choose the degree$")
	public void user_click_on_Degree_and_Choose_the_degree() throws Throwable {
		register.clickDegree();
		register.chooseDegree();
		Thread.sleep(100);
	}

	@Then("^User Click On done$")
	public void user_Click_On_done() throws Throwable {
		register.clickDone();
		Thread.sleep(100);
	}
	@Then("^User Choose The language$")
	public void user_Choose_The_language() throws Throwable {
	   register.chooseLanguage();
	   Thread.sleep(10000);
	}

	

}
