package com.accenture.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest02 {
	//default order of test methods execution: alphabetical order
	//change the order of execution using "priority" attribute on @Test
	//skip a test method execution using "enabled=false" attribute on @Test
  @Test(priority=1)
  public void testTwitter() {
	  System.out.println("testing twitter");
  }
  
  @Test(priority=3)
  public void testFacebook() {
	  System.out.println("testing facebook");
  }
  
  @Test(priority=2,enabled=false)
  public void testGoogle() {
	  System.out.println("testing google");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("executed before each test method");
	  
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("executed after each test method");
	 // System.out.println(); --> sysout with ctrl+space
	  
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class:executed once before the class execution begins");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("after class:executed once after the class execution is over");
  }
  
}

