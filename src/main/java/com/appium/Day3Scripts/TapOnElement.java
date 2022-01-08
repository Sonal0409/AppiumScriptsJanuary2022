package com.appium.Day3Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class TapOnElement {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "96352732140005T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", ".ApiDemos");
		
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	
		
	//MobileElement e =	driver.findElementByAccessibilityId("Views");
	
	TouchAction ta = new TouchAction(driver);
	
	Thread.sleep(2000);
	//ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(e))).perform();
	
	ta.tap(PointOption.point(465, 1640)).perform();
	
	Thread.sleep(2000);
	
	// 465, 1640
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	

}
