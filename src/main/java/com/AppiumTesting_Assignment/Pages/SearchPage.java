package com.AppiumTesting_Assignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchPage {
	
	public AppiumDriver<MobileElement> driver=null;
	public SearchPage(AppiumDriver<MobileElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    this.driver=driver; 
	}
	
	
	
	@AndroidFindBy(id ="in.workindia.nileshdungarwal.workindiaandroid:id/et_inputSearch")
	public WebElement click_Search;
	
	@AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[1]")
	public WebElement click_OnSearchJob;
	
	@AndroidFindBy(id ="in.workindia.nileshdungarwal.workindiaandroid:id/ib_favorite")
	public WebElement Add_ToFavourite;
	
	public void clickSearch()
	{
		click_Search.click();
	}
	public void EnterCityName(String value)
	{
		click_Search.sendKeys(value);
	}
	public void ClickOnJob()
	{
		click_OnSearchJob.click();
	}
	public void AddToFavourite() 
	{
		Add_ToFavourite.click();
	}

}
