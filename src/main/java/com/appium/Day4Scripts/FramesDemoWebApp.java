package com.appium.Day4Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FramesDemoWebApp {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "96352732140005T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		AndroidDriver<MobileElement>	driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

		
		driver.get("https://jqueryui.com/droppable/");
		
		// swtiching between frames on web app
		
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		
	String text1 = driver.findElementByXPath("//*[@id=\"draggable\"]/p").getText();
	
	System.out.println(text1);
	
	String text2 = driver.findElementByXPath("//*[@id=\"droppable\"]/p").getText();
	
	
	System.out.println(text2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
