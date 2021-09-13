package com.mindtree.Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports reporter;
	public static ExtentTest test;
	
	public static ExtentReports generateReport() {
		
		String out = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss'.html'").format(new Date());
		htmlReporter = new ExtentHtmlReporter(".//ExtentReports//MMT-"+out);
	    reporter = new ExtentReports();
	    reporter.attachReporter(htmlReporter);
	    
	    reporter.setSystemInfo("OS", "Windows 10");
	    reporter.setSystemInfo("Host Name", "SG");
	    reporter.setSystemInfo("Environment", "QA");
	    reporter.setSystemInfo("User Name", "Guptayashu99");

	    htmlReporter.config().setChartVisibilityOnOpen(true);
	    htmlReporter.config().setDocumentTitle("Automation Test Report for QA environment");
	    htmlReporter.config().setReportName("Test Report for Functional Testing");
	    htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	    htmlReporter.config().setTheme(Theme.STANDARD);
	    return reporter;
		
	}
	
	public static void extentAdd(String name, String result, ExtentTest test) {
	if (result.equals("fail")) {
	test.log(Status.FAIL, MarkupHelper.createLabel(name + "Test case FAILED due to below issues:",
	ExtentColor.RED));
	} 
	
	else if (result.equals("pass")) {
	test.log(Status.PASS, MarkupHelper.createLabel(name +  "Test Case PASSED", ExtentColor.GREEN));
	} 
	
	else {
	test.log(Status.SKIP,
	MarkupHelper.createLabel(name + " Test Case SKIPPED", ExtentColor.ORANGE));
	}
	}
		
}

