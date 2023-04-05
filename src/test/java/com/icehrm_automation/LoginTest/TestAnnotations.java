package com.icehrm_automation.LoginTest;
import org.testng.annotations.*;

public class TestAnnotations {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	@Test
	public void test() {
		System.out.println("test1");
		
	}

	
	}


