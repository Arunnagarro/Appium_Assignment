package com.AppiumTesting_Assignment.Utility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CommonUtils {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	AppiumDriver<MobileElement> driver;

	public void setAndroidCapabilities()
	{
		//Set capabilities
		File appdir = new File("ApkFile");
		File app = new File(appdir, "in.workindia.apk");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "Android Emulator");
		//capabilities.setCapability("platformVersion", "9.0");
		capabilities.setCapability("appPackage", "in.workindia.nileshdungarwal.workindiaandroid");
		capabilities.setCapability("appActivity", "in.workindia.nileshdungarwal.workindiaandroid.RegisterActivity");
		capabilities.setCapability("app", "C:\\Users\\arun02\\Downloads\\in.workindia.apk");
		capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability("deviceName", "Android");
	}
	
	public AppiumDriver<MobileElement> getAndroidDriver() throws MalformedURLException
	{
		return driver =  new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		
	}

}
