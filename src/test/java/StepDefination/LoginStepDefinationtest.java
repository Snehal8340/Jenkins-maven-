package StepDefination;

import PageActionModel.LoginPageActiontest;
import TestRunnerLibrary.BaseClasstest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinationtest {
	LoginPageActiontest lpat= new LoginPageActiontest(BaseClasstest.getDriver());
	 
	@Given("^Launch browser to \"(.*)\" and nevigate to url to 24july \"(.*)\"$")
	public void launch_browser_and_nevigate_to_url(String choice,String url) {
		lpat.LaunchBrowser(url,choice);
	}
	
	@When("^Type username as \"(.*)\"$")
	public void type_username_as(String username) 
	{
		lpat.type_username(username);
	}
	
	@And("^Type password as \"(.*)\"$")
	public void type_password_as(String pass) 
	{
		lpat.type_pass(pass);
	}
	
	@Then("^Click login button$")
	public void click_login_button()
	{
		lpat.clickbutton();
	}

	@Then("^Quit browser$")
	public void quitbrowser()
	{
	   BaseClasstest.getDriver().quit();
	}
	
}

