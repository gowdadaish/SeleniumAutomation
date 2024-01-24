package com.cliniops.selenium;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportGenerater {

	public static void main(String[] args) {


		ExtentReports extent = new ExtentReports();

		for(int i = 0; i<5; i++) {



			String str1 = "Report"+i;

			ExtentSparkReporter spark = new ExtentSparkReporter("C:\\SeleniumReport\\"+str1+".html");
			spark.config().setDocumentTitle("Automation Report");
			spark.config().setReportName("Extent Report");
			extent.attachReporter(spark);


			ExtentTest test = extent.createTest("login test");
			test.pass("login started Succesfully");
			test.info("url is loaded");
			test.pass("passpord accepted");
			test.pass("login pass");
			test.fail("fail ");       
			extent.flush();

		}
	}

}
