package com.appium.Base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	public static AndroidDriver<MobileElement> driver;
	
	public static DesiredCapabilities cap ;
	
	public static void startEmulator() throws MalformedURLException
	{
		cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo13dec");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
	}
	
	public static void startRealDevice() throws MalformedURLException
	{
		

		cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "96352732140005T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		
		 driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			
	}
	
	public static void startRealDeviceApiDemos() throws MalformedURLException
	{
		

		cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "96352732140005T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", ".ApiDemos");
		
		 driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			
	}
	
	
	
	
	
	
	
	

}
