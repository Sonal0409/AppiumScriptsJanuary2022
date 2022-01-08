package com.appium.Day5Scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.appium.Base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestAnnotationAppium extends Base{
	
	
	@Test(priority='1')
	public void testcase1() throws InterruptedException, MalformedURLException
	{

       startEmulator();
		
		driver.findElementByAccessibilityId("Preference").click();
		
		Thread.sleep(3000);
		
		driver.findElementByAccessibilityId("3. Preference dependencies").click();
		
		Thread.sleep(3000);
		
		
	}
	
	
	
	@Test(priority='2')
	
	public void testcase2() throws MalformedURLException, InterruptedException
	{
		startRealDeviceApiDemos();
	

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
