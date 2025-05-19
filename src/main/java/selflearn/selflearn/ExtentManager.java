package selflearn.selflearn;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	ExtentReports extent;
	ExtentTest test;
	
	public void createReport() {
		if(extent==null) {
			ExtentSparkReporter reporter=new ExtentSparkReporter("test-output/ExtentReports.html");
			extent= new ExtentReports();
			extent.attachReporter(reporter);
			test=extent.createTest("Sample Program Run");
			test.info("SUCCESSFULLY OPENED THE URL");
			test.log(Status.INFO,"SUCCESSFULLY OPENED THE URL");
			extent.flush();
		}
	}
}
