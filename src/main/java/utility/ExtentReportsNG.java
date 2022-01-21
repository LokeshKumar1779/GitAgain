package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsNG {
	
	static ExtentReports er;
	public static ExtentReports getReportObject() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter sr = new ExtentSparkReporter(path);
		sr.config().setReportName("WebAutomation Results");
		sr.config().setDocumentTitle("TestAutomationResults");
		
		er = new ExtentReports();
		er.attachReporter(sr);
		er.setSystemInfo("Tester", "Lokesh Kumar");
		
		return er;
	}

}
