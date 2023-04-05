package com.ice_hrm_automation;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.icehrm_automation.utility.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestListeners extends BaseClass implements ITestListener, ISuiteListener {
    String reportPath;
    public  TestListeners(){

    }
    @Override
    public void onStart(ISuite suite) {
        System.out.println("This is onStart of ISuite form TestListeners");
        LocalDateTime dateTime = LocalDateTime.now(); //get current time
        String currentDateTime = dateTime.format(DateTimeFormatter.ofPattern("dd_MM_yyyy_hh_mm")); // format current time
        reportPath = System.getProperty("user.dir") + "/reports/" + "report_" + currentDateTime;
        File file = new File(reportPath);
        if (!file.exists()) {
            file.mkdir();  // create folder based on provided folder path
        }
        String htmlReport = reportPath + "/AutomationReport.html";
        System.out.println(htmlReport);
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(htmlReport);
        ExtentReports extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
        extentReports.setSystemInfo("user", "cyber success");
        extentReports.setSystemInfo("OS", "mac");
        extentReports.setSystemInfo("env", "QA");
    }

    @Override
    public void onFinish(ISuite suite) {
        System.out.println("This is onFinish of ISuite from TestListeners");
        ExtentReports extentReports = null;
		extentReports.flush();
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("This is onStart of ITestContext from TestListeners");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("This is onFinish of ITestContext from TestListeners");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("This is onTestStart of ITestResult from TestListeners");
        String methodName = result.getMethod().getMethodName();
        ExtentReports extentReports = null;
		ExtentTest log = extentReports.createTest(methodName);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("This is onTestSuccess of ITestResult from TestListeners");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String screenshotPath = reportPath + "/" + result.getMethod().getMethodName() + ".jpg";
        try {
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
            File dstFile = new File(screenshotPath);
            FileUtils.copyFile(srcFile, dstFile);
        } catch (IOException ignored) {
        }
        ExtentTest log = null;
		log.fail(result.getThrowable().getMessage());
        log.addScreenCaptureFromPath(screenshotPath, "failed screenshot");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("This is onTestSkipped of ITestResult from TestListeners");
    }

}