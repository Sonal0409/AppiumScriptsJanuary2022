package com.appium.Day4Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebAppGoogle {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "96352732140005T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		AndroidDriver<MobileElement>	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		
		
		driver.findElementByXPath("//input[@type='search']").sendKeys("Appium");
		
		
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		
		
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div[1]/a/div[2]/div").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
