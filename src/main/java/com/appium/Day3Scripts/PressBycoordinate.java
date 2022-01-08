package com.appium.Day3Scripts;

import java.net.MalformedURLException;
import java.time.Duration;

import com.appium.Base.Base;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class PressBycoordinate extends Base {
	
	public static void main(String [] args) throws MalformedURLException, InterruptedException
	{
	// coordinate: 533, 1267
	
	
	// press and wait on the coordinate, display details of the location
	
	startRealDevice();
	
	TouchAction ta = new TouchAction(driver);
	
	Thread.sleep(2000);
	
	ta.press(PointOption.point(533,1267))
	.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
	.release()
	.perform();
	
	
	Thread.sleep(2000);
	
	
	MobileElement e1 = driver.findElementByXPath("//android.widget.Button[@text='Directions']");
	
	Thread.sleep(2000);
	
	ta.tap(TapOptions.tapOptions().withElement(ElementOption.element(e1))).perform();
	
	Thread.sleep(2000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
