package com.appium.Day2Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemosAllLocators {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

	DesiredCapabilities cap = new DesiredCapabilities();
	
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo13dec");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
	cap.setCapability("appPackage", "io.appium.android.apis");
	cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	
	AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	
	// click on preference using Accessibility Locator
	
	driver.findElementByAccessibilityId("Preference").click();
	
	Thread.sleep(2000);
	
	// click on Switch using ID locator
	
	driver.findElementsById("android:id/text1").get(8).click();
	
	Thread.sleep(2000);
	// click on checkbox using classname locator
	
	String checkboxstatus = driver.findElementByClassName("android.widget.CheckBox").getAttribute("checked");
	
	System.out.println("Status of checkbox is true or false ?" + checkboxstatus); // false
	

	
	driver.findElementByClassName("android.widget.CheckBox").click();
	
	Thread.sleep(2000);
	
String checkboxstatus1 = driver.findElementByClassName("android.widget.CheckBox").getAttribute("checked");
	
	System.out.println("Status of checkbox is true or false ?" + checkboxstatus1); // true
	
	// click on switch using XPATH locator
	
	driver.findElementByXPath("//android.widget.Switch[@text='OFF']").click();
	
	Thread.sleep(2000);
	
	
	// Fetch attribute values from the application and print it on the console
	
	String switchText = driver.findElementsById("android:id/switch_widget").get(0).getAttribute("text");
	
	System.out.println("the switch text is ON Now" + switchText );
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
