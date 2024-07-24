package PageActionModel;

import org.openqa.selenium.WebDriver;

import PageObjectModel.LoginPageObjecttest;
import TestRunnerLibrary.BaseClasstest;

public class LoginPageActiontest extends LoginPageObjecttest {

	
	public LoginPageActiontest(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}

	static WebDriver driver=BaseClasstest.getDriver();
	
	public void type_username(String data) {
		enterDataInElement(uname, data);
	}
	
	public void type_pass(String data) {
		enterDataInElement(pswd, data);
	}
	
    public void clickbutton() {
    	clickElement(loginBtn);
    }
	
}