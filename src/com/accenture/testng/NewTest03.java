package com.accenture.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest03 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class newtest03");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class newtest03");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest: executed once for all the classes under test case");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest: executed once for all the classes under test case");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}
	
	
	
  @Test
  public void method1() {
	  System.out.println("testing method1");
  }
}

