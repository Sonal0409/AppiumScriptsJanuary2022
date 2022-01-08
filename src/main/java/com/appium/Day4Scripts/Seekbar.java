package com.appium.Day4Scripts;

import java.net.MalformedURLException;

import com.appium.Base.Base;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class Seekbar extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
startRealDeviceApiDemos();
		
		driver.findElementByAccessibilityId("Views").click();
		
		Thread.sleep(2000);
		
		// scrolling using UI automator framework
		
		MobileElement e1 = (MobileElement) ((FindsByAndroidUIAutomator)driver)
				           .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
		                    ".scrollIntoView(new UiSelector().text(\"Seek Bar\"))");
		
		e1.click();
		
		Thread.sleep(2000);
		
		// position1 : 	550, 272
		// position 2: 754,268
		
		(new TouchAction(driver))
		.longPress(new PointOption().withCoordinates(550,272))
		.moveTo(new PointOption().withCoordinates(754,268))
		.release()
		.perform();
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		


	}

}
