package StepDefination;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import TestRunnerLibrary.BaseClasstest;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class hookstest {

	static String path = System.getProperty("user.dir");
	
	
	@AfterStep
	public void takeScraenshotOnFailure(Scenario scenario) {

	if (scenario.isFailed()) {

	TakesScreenshot ts = (TakesScreenshot) BaseClasstest.getDriver();

	byte[] src = ts.getScreenshotAs(OutputType.BYTES);
	scenario.attach(src, "image/png", returnCurrentTimeStamp());
	}

	}
	
	public static String returnCurrentTimeStamp() {
	SimpleDateFormat date = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
	// 20240106144137
	String timeStamp = date.format(new Date());
	String value1 = timeStamp.replaceAll(":", "");
	String value2 = value1.replaceAll(" ", "");
	System.out.println(value2);
	return value2;
}
	
}

