package com.AppiumTesting_Assignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ViewProfilePage {

	public AppiumDriver<MobileElement> driver=null;
	public ViewProfilePage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	    this.driver=driver; 
	}
	
	
	
	  @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[4]/android.widget.ImageView")
	  public WebElement click_Profile;
	  
	  @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout")
	  public WebElement click_MyProfile;
	  
	  @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[7]/android.widget.LinearLayout/android.widget.TextView[1]")
	  public WebElement click_LanguageFill;
	  
	  @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
	  public WebElement click_EnglishL;
	  
	  @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
	  public WebElement click_SubmitL;
	  
	  @AndroidFindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button")
	  public WebElement click_Update;
	  
	  
	  
	  public void ClickProfile() 
	  {
			click_Profile.click();
		}
	  public void ClickMyProfile() 
	  {
			click_MyProfile.click();
		}
	  public void ClickLanguageFill()
	  {
			click_LanguageFill.click();
		}
	  public void chooseEnglishLanguage() 
	  {
			click_EnglishL.click();
		}
	  public void cickSubmitl() 
	  {
			click_SubmitL.click();
		}
	  public void ClickBack() 
	  {
			click_Update.click();
		}
			

}
