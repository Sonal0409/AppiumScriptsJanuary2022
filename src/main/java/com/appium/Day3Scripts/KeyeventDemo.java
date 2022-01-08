package com.appium.Day3Scripts;

import java.net.MalformedURLException;

import com.appium.Base.Base;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KeyeventDemo extends Base {
	
	public static void main(String [] args) throws MalformedURLException, InterruptedException
	{
		startRealDevice();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Search here']").click();
		
		Thread.sleep(2000);
		
		
		
		driver.findElementById("com.google.android.apps.maps:id/search_omnibox_edit_text").sendKeys("N");
		
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.W));
		driver.pressKey(new KeyEvent(AndroidKey.D));
		driver.pressKey(new KeyEvent(AndroidKey.E));
		driver.pressKey(new KeyEvent(AndroidKey.L));
		driver.pressKey(new KeyEvent(AndroidKey.H));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	
	

}
