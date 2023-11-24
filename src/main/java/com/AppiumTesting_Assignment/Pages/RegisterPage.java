package com.AppiumTesting_Assignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterPage {
	
	public AppiumDriver<MobileElement> driver=null;
	public RegisterPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    this.driver=driver; 
	}
	
	
	//use xpath and id 
	  @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText")
			public WebElement click_Name;
			///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/TextInputLayout[1]/android.widget.FrameLayout/android.widget.EditText

			@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/TextInputLayout[2]/android.widget.FrameLayout/android.widget.EditText")
			public WebElement click_PhoneNumber;
			
			@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button")
			public WebElement click_submit;
			
			@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout[3]/android.widget.Button")
			public WebElement click_city;
			
			@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/act_auto_complete")
			public WebElement entercity;
			
			@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
			public WebElement click_Submit;
			
			@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RadioGroup/android.widget.FrameLayout[2]/android.widget.Button")
			public WebElement click_gender;
			
			@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/rb_graduate")
			public WebElement click_qualification;
			
			@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/cb_english")
			public WebElement click_SchoolMedium;
			
			@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/rg_eng_level_3")
			public WebElement click_EnglishLevel;
			
			@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/cb_fresher")
			public WebElement choose_ExperFresher;
			
			@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/et_age")
			public WebElement click_Age;
			
			@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[7]")
			public WebElement choose_Age;
			
			@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.CheckBox")
			public WebElement choose_interest;
			
			@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.GridView/android.widget.FrameLayout[14]/android.widget.CheckBox")
			public WebElement click_SubmitOption;
		

			
			@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
			public WebElement click_FillForm;
			
			@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout")
			public WebElement choose_WhatYouKnowOption;
			
			@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
			public WebElement choose_WhatYouKnowOption1;
			
			@AndroidFindBy(id="android:id/button1")
			public WebElement click_SubmitO;
			
			@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/tv_course")
			public WebElement click_Degree;
			
			@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
			public WebElement choose_Degree;	
			
			@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/btn_done")
			public WebElement click_Done;
			
			@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/btn_english")
			public WebElement choose_Language;
			
			public void EnterName(String input) 
			{
				click_Name.sendKeys(input);
			}
			public void enterPhoneNumber(String Input1)
			{
				click_PhoneNumber.sendKeys(Input1);
			}
			public void click_submitbutton()
			{
				click_submit.click();
			}
			public void clickCityButton() 
			{
				click_city.click();
			}
			public void entercity(String Input2)
			{
				entercity.sendKeys(Input2);
			}
			public void clickSubmit() 
			{
				click_Submit.click();
			}
			public void chooseGender()
			{
				click_gender.click();
			}
			public void chooseQualifications() 
			{
				click_qualification.click();
			}
			public void chooseSchoolMedium() 
			{
				click_SchoolMedium.click();
			}
			public void chooseEnglishLevel()
			{
				click_EnglishLevel.click();
			}
			public void chooseExperOrFresher() 
			{
				choose_ExperFresher.click();
			}
			public void clickAge() 
			{
				click_Age.click();
			}
			public void chooseAge()
			{
				choose_Age.click();
			}
			public void chooseInterest() 
			{
				choose_interest.click();
			}
			public void clickSubmitOption() 
			{
				click_SubmitOption.click();
			}
			public void clickFillForm()
			{
				click_FillForm.click();
			}
			public void chooseWhatYouKnow() 
			{
				choose_WhatYouKnowOption.click();
			}
			public void chooseWhatYouKnow1() 
			{
				choose_WhatYouKnowOption1.click();
			}
			public void clickSubmitO()
			{
				click_SubmitO.click();
			}
			
			public void clickDegree() {
				click_Degree.click();
			}
			public void chooseDegree() 
			{
				choose_Degree.click();
			}
			public void clickDone() 
			{
				click_Done.click();
			}
			public void chooseLanguage()
			{
				choose_Language.click();
			}
			

}
