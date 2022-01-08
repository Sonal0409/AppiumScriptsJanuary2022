package com.appium.Day3Scripts;

import java.net.MalformedURLException;
import java.time.Duration;

import com.appium.Base.Base;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class SwipeDemo extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		startRealDevice();
		
	//	coord A : 520, 751
	//	coord B : 537, 1375
		
		// press on A --> wait for sometime --> move to element B then release & Perform
		
		TouchAction ta = new TouchAction(driver);
		
		Thread.sleep(2000);
		
		ta.longPress(PointOption.point(520, 751))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
		.moveTo(PointOption.point(537,1375))
		.release()
		.perform();
		
		
		

	}

}
