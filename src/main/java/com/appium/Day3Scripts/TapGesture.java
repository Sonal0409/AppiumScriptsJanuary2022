package com.appium.Day3Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.appium.Base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;

public class TapGesture extends Base{
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		startRealDevice();
		
		
		// tap at a location on google maps
		
		// coordinates : (251,1178)
		
		
		TouchAction ta = new TouchAction(driver);
		
		ta.tap(PointOption.point(251, 1178)).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
