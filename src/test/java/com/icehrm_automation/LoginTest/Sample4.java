package com.icehrm_automation.LoginTest;
import org.testng.annotations.*;

	public class Sample4 {

	   /* @BeforeSuite
	    public void beforeSuite(){
	        System.out.println("this is before suite from sample class");
	    }

	    @AfterSuite
	    public void afterSuite(){
	        System.out.println("this is after suite from sample class");
	    }

	    @BeforeTest
	    public void beforeTest(){
	        System.out.println("This is before test from sample class");
	    }

	    @AfterTest
	    public void afterTest(){
	        System.out.println("This is after test from sample class");
	    }*/

	    @Test
	    public void sample4Test1(){
	        System.out.println("This is test1 from sample4 class");
	    }
	    @Test
	    public void sample4Test2(){
	        System.out.println("This is test2 from sample4 class");
	    }
	    @Test
	    public void sample4Test3(){
	        System.out.println("This is test3 from sample4 class");
	    }
	    @BeforeClass
	    public void beforeClass(){
	        System.out.println("Sample4 Before class");
	    }
	    @AfterClass
	    public void afterClass(){
	        System.out.println("Sample4 After class");
	    }

	    @BeforeMethod
	    public void beforeMethod(){
	        System.out.println("Sample4 Before method");
	    }

	    @AfterMethod
	    public void afterMethod(){
	        System.out.println("Sample4 after method");
	    }
	

	
	}


