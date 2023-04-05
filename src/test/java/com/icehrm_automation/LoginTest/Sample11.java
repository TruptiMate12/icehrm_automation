package com.icehrm_automation.LoginTest;

import com.icehrm_automation.utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.*;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Sample11 extends BaseClass {

    @BeforeGroups(groups = {"sanity"})
    public void beforeGroups(){
        System.out.println("This is before group method");
    }

    @AfterGroups(groups = {"sanity"})
    public void afterGroups(){
        System.out.println("This is after group method");
    }

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

    @Test(groups = {"sanity"})
    public void sample1Test1() throws AWTException {
        System.out.println("This is test1 from sample1 class");
        System.out.println(driver.getTitle());
    }

    @Test(groups = {"sanity"})
    public void sample1Test2() {
        System.out.println("This is sample 1 class Test2 method");
        System.out.println(driver.getTitle());

    }

    @Test(groups = {"regression"})
    public void sample1Test3() {
        System.out.println("This is sample 1 class Test3 method");
        System.out.println(driver.getTitle());

    }

    @Test(groups = {"regression"})
    public void sample1Test4() {
        System.out.println("This is sample 1 class Test4 method");
        System.out.println(driver.getTitle());

    }

    @Test(groups = {"regression"})
    public void sample1Test5() {
        System.out.println("This is sample 1 class Test5 method");
        System.out.println(driver.getTitle());

    }

    @BeforeClass(groups = "sanity")
    public void beforeClass() {
        System.out.println("Sample1 Before class");
        launchBrowser("edge");
        driver.get("https://google.com");
    }

    @AfterClass(groups = "sanity")
    public void afterClass() {
        System.out.println("Sample1 After class");
        driver.quit();
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Sample1 Before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Sample1 after method");
    }
}