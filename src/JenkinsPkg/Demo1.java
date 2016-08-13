package JenkinsPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo1 
{

	ExtentReports e = new ExtentReports("./ExtentReport/ExtentReport.html");
	ExtentTest t=e.startTest("test");
	@Test
	public void testA()
	{
		//System.setProperty("webdriver.gecko.driver","C:/Users/CBT/Downloads/geckodriver-v0.9.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("Https://www.google.com");
		Reporter.log("Opening google..",true);
		//driver.close();
		// e = new ExtentReports("./ExtentReport/ExtentReport.html");
		 t=e.startTest("test");
		t.log(LogStatus.PASS, "hi.. bye..");
		e.endTest(t);
		
		 
			
	}
	@Test
	public void testB()
	{
		 t=e.startTest("test");	
		t.log(LogStatus.FAIL, "hi.. bye..");
		e.endTest(t);
		
		e.flush(); 
			
	}
	
}
