package com.appium.Day3Scripts;

import java.net.MalformedURLException;
import java.time.Duration;

import com.appium.Base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class DragDropDemo extends Base{
	
	public static void main(String [] args) throws MalformedURLException
	{
		startRealDeviceApiDemos();
		
		TouchAction ta = new TouchAction(driver);
		
		MobileElement view = driver.findElementByAccessibilityId("Views");
		
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(view))).perform();
		
		MobileElement DD = driver.findElementByAccessibilityId("Drag and Drop");
		
		ta.press(ElementOption.element(DD)).release().perform();
		
		
		MobileElement dot1= driver.findElementsByClassName("android.view.View").get(0);
		
		MobileElement dot2= driver.findElementsByClassName("android.view.View").get(1);
		
	//	ta.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(dot1)))
	//	.moveTo(ElementOption.element(dot2)).release().perform();
		
		
		ta.press(ElementOption.element(dot1)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
			.moveTo(ElementOption.element(dot2)).release().perform();
	}
	
	

}
