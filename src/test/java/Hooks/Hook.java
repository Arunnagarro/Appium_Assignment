 package Hooks;

import java.net.MalformedURLException;

import com.AppiumTesting_Assignment.Utility.CommonUtils;

import BaseTest.BaseClass;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Hook extends BaseClass
{
	public static AppiumDriver<MobileElement> GetDriver()
	{
		return driver;
	}
	
	//Test for app 
	@Before("@Test1")
	public void launchandinstallapp() throws MalformedURLException 
	{
		CommonUtils objCommonUtils = new CommonUtils();
		objCommonUtils.setAndroidCapabilities();
		driver = objCommonUtils.getAndroidDriver();
	}
}
