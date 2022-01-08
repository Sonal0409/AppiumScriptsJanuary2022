package com.appium.Day2Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class APIDemosIDLocator {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

	DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo13dec");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
	cap.setCapability("appPackage", "io.appium.android.apis");
	cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	
	AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	
	Thread.sleep(2000);
	
	// click on preference
	
	driver.findElementsById("android:id/text1").get(9).click();
	
	Thread.sleep(2000);
	
	// click on preference dependency
	
	driver.findElementsById("android:id/text1").get(2).click();
	
	// click on checkbox
	Thread.sleep(2000);
	
	driver.findElementById("android:id/checkbox").click();
	
	// click on wifi settings
	Thread.sleep(3000);
	
	driver.findElementsById("android:id/title").get(2).click();
	
	// Enter value in the input box
	
	Thread.sleep(3000);
	
	driver.findElementById("android:id/edit").sendKeys("sonal123");
	
	
	
	Thread.sleep(2000);
	
	
	driver.findElementById("android:id/button1").click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
