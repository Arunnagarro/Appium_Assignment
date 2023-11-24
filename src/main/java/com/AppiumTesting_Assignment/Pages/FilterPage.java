package com.AppiumTesting_Assignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FilterPage {
	
	public AppiumDriver<MobileElement> driver=null;
	public FilterPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    this.driver=driver; 
	}
	
	//use id to perform a actions
	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/btn_filter")
	public WebElement ClickFilter;
	
	
	//use xpath
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.GridView/android.widget.FrameLayout[4]/android.widget.CheckBox")
	public WebElement Click_Option;
	

	
	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/cb_fresher")
	public WebElement Choose_Fresher;
	
	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/btn_apply")
	public WebElement Click_Apply;

	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/tv_heading")
	public WebElement Click_Job;
	
	public void clickOnFilters()
	{
		ClickFilter.click();
	}
	public void clickOtherOption() 
	{
		Click_Option.click();
	}
	
	public void ChooseFresher()
	{
		Choose_Fresher.click();
	}
	public void clickOnApply() 
	{
		Click_Apply.click();
	}
	public void clickOnjOB() 
	{
		Click_Job.click();
	}


	
}
