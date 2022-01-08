package com.appium.Day3Scripts;

import java.net.MalformedURLException;

import com.appium.Base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class ScrollingApiDemos extends Base{
	
	public static void main(String [] args) throws MalformedURLException, InterruptedException
	{
		startRealDeviceApiDemos();
		
		TouchAction ta = new TouchAction(driver);
		
		MobileElement view = driver.findElementByAccessibilityId("Views");
		
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(view))).perform();
		
	// scroll upwards
		
		// coordiname A : 601,1182
		
		// B : 588,516
		
		Thread.sleep(2000);
		
		for(int i =0; i<5;i++)
		{
		
		ta.press(new PointOption().withCoordinates(601,1182))
		.moveTo(new PointOption().withCoordinates(588, 516))
		.release()
		.perform();
		
		
		}
		
		MobileElement e1 = driver.findElementByAccessibilityId("TextFields");
		
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(e1))).perform();
		
		
		driver.findElementById("io.appium.android.apis:id/edit").sendKeys("A");
		
		driver.pressKey(new KeyEvent(AndroidKey.P));
		driver.pressKey(new KeyEvent(AndroidKey.P));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.U));
		driver.pressKey(new KeyEvent(AndroidKey.M));
		
		Thread.sleep(3000);
		
		driver.findElementById("io.appium.android.apis:id/edit").clear();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
