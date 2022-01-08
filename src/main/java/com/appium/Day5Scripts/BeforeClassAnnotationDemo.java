package com.appium.Day5Scripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BeforeClassAnnotationDemo {
	
	DesiredCapabilities cap;
	
	AndroidDriver <MobileElement> driver;
	
	@BeforeClass
	public void methodBefore() throws MalformedURLException
	{

		cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo13dec");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
		cap.setCapability("appPackage", "io.appium.android.apis");
		cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	}
	
	
	@Test(priority='1')
public void method3() throws InterruptedException
{
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']").click();
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		
		
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.TextView[@text='People Names']").click();
		
		Thread.sleep(2000);
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Chuck']").click();
		
		// fetch all the values from the expandable list and print it and click on one of the item
		
		// Once we fetch it, we have to store it in a list object
		
		
		
		List <MobileElement> val = driver.findElementsByClassName("android.widget.TextView");
		
		System.out.println(val.size());
		
		
		
		for(MobileElement temp:val)
		{
			String text = temp.getText();
			
			System.out.println(text);
			
			if(text.equalsIgnoreCase("Barry"))
			{
				temp.click();
			}
		}
		
}
		
	@Test(priority='2')	
	public void method4() throws InterruptedException
	{
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.findElementsByClassName("android.widget.TextView").get(12).click();
		
		Thread.sleep(2000);
		
		
		driver.findElementsByClassName("android.widget.TextView").get(9).click();
		
	}
		
}
	
	
	

