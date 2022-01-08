package com.appium.Day4Scripts;

import java.net.MalformedURLException;

import com.appium.Base.Base;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class SpinnerDemo extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		startRealDeviceApiDemos();
		
		driver.findElementByAccessibilityId("Views").click();
		
		Thread.sleep(2000);
		
		// scrolling using UI automator framework
		
		MobileElement e1 = (MobileElement) ((FindsByAndroidUIAutomator)driver)
				           .findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
		                    ".scrollIntoView(new UiSelector().text(\"Spinner\"))");

		
		e1.click();
		
		
		TouchAction ta = new TouchAction(driver);
		
		Thread.sleep(2000);
		
		MobileElement spn1 = driver.findElementById("io.appium.android.apis:id/spinner1");
		
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(spn1))).perform();
		
		Thread.sleep(2000);
		
		MobileElement item = driver.findElementsById("android:id/text1").get(2);
		
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(item))).perform();
		
		
		Thread.sleep(2000);
		
MobileElement spn2 = driver.findElementById("io.appium.android.apis:id/spinner2");
		
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(spn2))).perform();
		
		Thread.sleep(2000);
		
		MobileElement item2 = driver.findElementsById("android:id/text1").get(2);
		
		ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(item2))).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
