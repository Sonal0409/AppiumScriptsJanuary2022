package com.appium.Day4Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ToggleMethodsDemo {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities	cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "96352732140005T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		
		AndroidDriver<MobileElement>	 driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

		driver.rotate(ScreenOrientation.LANDSCAPE);
		
		Thread.sleep(2000);
		
		driver.rotate(ScreenOrientation.PORTRAIT);








		
		
	}
		
		
		
		
		
		
		
		
		
	}


