package JenkinsPkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 
{

	@Test
	public void testA()
	{
		//System.setProperty("webdriver.gecko.driver","C:/Users/CBT/Downloads/geckodriver-v0.9.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("Https://www.google.com");
		Reporter.log("Opening google..",true);
		//driver.close();
	}
}
