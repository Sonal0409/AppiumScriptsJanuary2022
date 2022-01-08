package com.appium.Day4Scripts;

import java.net.MalformedURLException;

import com.appium.Base.Base;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class RatingBarDemo extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
         startRealDeviceApiDemos();
         
     	driver.findElementByAccessibilityId("Views").click();
     	
     	Thread.sleep(2000);
     	
    	MobileElement e1 = (MobileElement) ((FindsByAndroidUIAutomator)driver)
		           .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                 ".scrollIntoView(new UiSelector().text(\"Rating Bar\"))");
    	
    	e1.click();
    	
    	TouchAction ta = new TouchAction(driver);
    	
    	
    	ta.tap(PointOption.point(615, 465)).perform();
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
		
	}

}
