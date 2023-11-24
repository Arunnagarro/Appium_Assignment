package com.AppiumTesting_Assignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SortByPage {
	

	public AppiumDriver<MobileElement> driver=null;
	public SortByPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    this.driver=driver; 
	}
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]")
	public WebElement Click_SortBy;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
	public WebElement Click_OnSortOption;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView[1]")
	public WebElement Click_OnJob;
	
	@AndroidFindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.view.ViewGroup/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]")
	public WebElement Click_OnCallToHR;
	
	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/btn_next")
	public WebElement Click_Next;
	
	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/rb_3")
	public WebElement Click_Answer;
	
	@AndroidFindBy(id="android:id/button1")
	public WebElement Click_NextQ;
	
	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/rb_1")
	public WebElement Click_Answer1;
	
	@AndroidFindBy(id="android:id/button1")
	public WebElement Click_Next1;
	
	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/rb_1")
	public WebElement Click_Answer2;
	
	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/rb_1")
	public WebElement Click_Answer3;
	
	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/rb_1")
	public WebElement Click_Answer4;
	
	@AndroidFindBy(id="in.workindia.nileshdungarwal.workindiaandroid:id/rb_2")
	public WebElement Click_Answer5;
	
	public void clickOnSortBy()
	{
		Click_SortBy.click();
	}
	public void clickOnSortOption()
	{
		Click_OnSortOption.click();
	}
	public void clickOnJob()
	{
		Click_OnJob.click();
	}
	public void clickOnCall()
	{
		Click_OnCallToHR.click();
	}
	public void ChooseNext()
	{
		Click_Next.click();
	}
	public void clickAnswer() 
	{
		Click_Answer.click();
	}
	public void clickOnNext1()
	{
		Click_Next1.click();
	}
	public void clickAnswer1()
	{
		Click_Answer1.click();
	}
	public void clickOnNext2()
	{
		Click_Next1.click();
	}
	public void clickAnswer2() 
	{
		Click_Answer2.click();
	}
	public void clickOnNext3()
	{
		Click_Next1.click();
	}
	public void clickAnswer3() 
	{
		Click_Answer3.click();
	}
	public void clickOnNext4()
	{
		Click_Next1.click();
	}
	public void clickAnswer4()
	{
		Click_Answer4.click();
	}
	public void clickOnNext5()
	
	{
		Click_Next1.click();
	}
	public void clickAnswer5() 
	
	{
		Click_Answer5.click();
	}
	public void clickOnNext6() 
	{
		Click_Next1.click();
	}
	
	
	
	
	
	
	
	
	

			

}
