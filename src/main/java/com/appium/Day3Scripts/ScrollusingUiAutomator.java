package com.appium.Day3Scripts;

import java.net.MalformedURLException;

import com.appium.Base.Base;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class ScrollusingUiAutomator extends Base{
	
	public static void main(String [] args) throws MalformedURLException, InterruptedException
	{
startRealDeviceApiDemos();
		
		TouchAction ta = new TouchAction(driver);
		
		MobileElement view = driver.findElementByAccessibilityId("Views");
		
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(view))).perform();
		
		
		// scrolling using UIautomator framework
		
		
		MobileElement m1 = (MobileElement) ((FindsByAndroidUIAutomator)driver)
				           .findElementByAndroidUIAutomator(
				        		   "new UiScrollable(new UiSelector().scrollable(true))" +
				           ".scrollIntoView(new UiSelector().text(\"TextFields\"))");
		
		m1.click();
		
		
		
		
		
		
	}
	
	

}
