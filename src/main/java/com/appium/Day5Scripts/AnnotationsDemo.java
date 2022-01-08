package com.appium.Day5Scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	
	
	// TestNG annotations
	
	// @Test: every annotation is written above a method
	
	@BeforeClass
	public void method1()
	{
		System.out.println("this is my before class script1");
	}
	
	@Test(priority='1')
	public void method2()
	{
		System.out.println("this is my appium script2");
	}
	@Test(priority='2')
	public void method3()
	{
		System.out.println("this is my appium script3");
	}
	@Test(priority='3')
	public void method4()
	{
		System.out.println("this is my appium script4");
	}
	
	@AfterClass
	public void aftertestmethod()
	{
		System.out.println("this methos is exeucted after all the test methods");
	}
	

}
