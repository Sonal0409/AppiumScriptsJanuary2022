package com.appium.Day5Scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParameterDemo {
	
	
DesiredCapabilities cap;
	
	AndroidDriver <MobileElement> driver;
	
	@Parameters({"deviceName","Version","ServerURL"})
	@BeforeClass
	public void methodBefore(String deviceName, String Version,String ServerURL) throws MalformedURLException
	{

		cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName );
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,Version );
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		driver = new AndroidDriver<MobileElement>(new URL(ServerURL),cap);
	}
	
    @Parameters({"input"})
	@Test(priority='1')
public void method3(String input) throws InterruptedException
{
		
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
		
		driver.findElementById("android:id/edit").sendKeys(input);
		
		
		
		Thread.sleep(2000);
		
		
		driver.findElementById("android:id/button1").click();
		
		
		
}

}
