package com.appium.Day2Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosClassName {
	
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
	driver.findElementsByClassName("android.widget.TextView").get(12).click();
	
	Thread.sleep(2000);
	
	
	driver.findElementsByClassName("android.widget.TextView").get(9).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
