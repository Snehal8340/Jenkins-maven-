package test_runner_library;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base_class extends Test_runner_class {
	
	static WebDriver driver;

	public Base_class(WebDriver _driver) {
		driver = _driver;
	}
	
	public void launchbrowser(String url,String choice ) {
		if(choice.equalsIgnoreCase("chrome")) {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("start-maximized");
			driver=new ChromeDriver(option);
			driver.navigate().to(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		}
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public void tearDown() {
		driver.quit();
	}

}
