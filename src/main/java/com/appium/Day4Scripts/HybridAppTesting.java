package com.appium.Day4Scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class HybridAppTesting {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "96352732140005T");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		cap.setCapability("chromedriverExecutable","C:\\Grid\\chromedriver.exe");
		
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		
		Thread.sleep(7000);
		
		
		driver.findElementByXPath("//android.widget.TextView[@text='Flipkart']").click();
		
		// find the name sof different views on the app
		
		Set<String> cns =driver.getContextHandles();
		
		System.out.println(cns + "\n\n");  // [NATIVE_APP, WEBVIEW_chrome]
		
		Thread.sleep(2000);
		
		// switch to web view
		
		driver.context("WEBVIEW_chrome");
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[2]/div[1]/div/div[1]/a[1]/img").click();
		
		
		Thread.sleep(5000);
		
		driver.findElementByXPath("//*[@id=\"container\"]/div/div[8]/div/div/div[2]/div/div[2]/div/div[12]/div/ul/div[3]/li/a/div/span").click();
		
		// switch to the Native_View
		
		driver.context("NATIVE_APP");
		
		Thread.sleep(2000);
		
		driver.findElementByAccessibilityId("Home").click();
		
		Thread.sleep(3000);
		
		driver.findElementById("com.android.chrome:id/menu_button").click();
		
		Thread.sleep(2000);
		
		driver.findElementByAccessibilityId("History").click();
		
		
		
		
		
		
		

	}

}
