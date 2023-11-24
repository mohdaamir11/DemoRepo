package com.qa.ExtentReportListener;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.internal.LogManagerStatus;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReporterNG implements IReporter {
//	ExtentReports extent;
//
//	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,String outputDirectory) 
//	{    String str = outputDirectory + File.separator + "Extent.html";
//	 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(str, true);
//
//		for (ISuite suite : suites) {
//			Map<String, ISuiteResult> result = suite.getResults();
//
//			for (ISuiteResult r : result.values()) {
//				ITestContext context = r.getTestContext();
//
//			    buildTestNodes(context.getPassedTests(), Status.PASS);
//				buildTestNodes(context.getFailedTests(), Status.FAIL);
//				buildTestNodes(context.getSkippedTests(), Status.SKIP);
//			}
//		}
//
//		extent.flush();
//	 
//	}
//
//	private void buildTestNodes(IResultMap tests,Status status) {
//		ExtentTest test;
//
//		if (tests.size() > 0) {
//			for (ITestResult result : tests.getAllResults()) {
//				test = extent.createTest(result.getMethod().getMethodName());
//
//				test.setStartedTime(getTime(result.getStartMillis()));
//				test.setEndedTime(getTime(result.getEndMillis()));
//
//				for (String group : result.getMethod().getGroups())
//					test.assignCategory(group);
//
//				if (result.getThrowable() != null) {
//					test.log(status, result.getThrowable());
//				} else {
//					test.log(status, "Test " + status.toString().toLowerCase()
//							+ "ed");
//				}
//
//				extent.endTest(test);
//			}
//		}
//	}
//
//	private Date getTime(long millis) {
//		Calendar calendar = Calendar.getInstance();
//		calendar.setTimeInMillis(millis);
//		return calendar.getTime();
//	}
}