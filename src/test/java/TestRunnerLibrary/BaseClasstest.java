package TestRunnerLibrary;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClasstest extends Test {
	
static WebDriver driver;
	
	public BaseClasstest(WebDriver _driver) {
		
		driver=_driver;
	}
	
	public void LaunchBrowser(String url,String choice) {
		if(choice.equalsIgnoreCase("chrome"));
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("start-maximized");
		driver =new ChromeDriver(option);
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	}
	
	public static WebDriver getDriver() {
		return driver;
		
	}
	
	public void teardown() {
		driver.quit();
	}
}

