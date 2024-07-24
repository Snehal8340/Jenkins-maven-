package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonLibrary.CommonMethodstest;
import TestRunnerLibrary.BaseClasstest;

public class LoginPageObjecttest extends CommonMethodstest {

	
	public LoginPageObjecttest(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	static WebDriver driver=BaseClasstest.getDriver();
	
	public By uname = By.xpath("//input[@name='username']"); 
	public By pswd = By.xpath("//input[@type='password']");
	public By loginBtn = By.xpath("//button[@type='submit']");

}

