package StepDefination;

import PageActionModel.LoginPageActiontest;
import PageActionModel.MyInfoPageActiontest;
import TestRunnerLibrary.BaseClasstest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyInfoStepDeftest {
	LoginPageActiontest lpat=new LoginPageActiontest(BaseClasstest.getDriver());
	MyInfoPageActiontest mfp= new MyInfoPageActiontest(BaseClasstest.getDriver());

	@Given("^Launch browser to 25july24 \"(.*)\" and nevigate to url \"(.*)\"$")
	public void launch_browser_and_nevigate_to_url(String choice,String url) {
		lpat.LaunchBrowser(url,choice);
	}
	
	@When("^Type username 25july24 as \"(.*)\"$")
	public void type_username_as(String username) 
	{
		lpat.type_username(username);
	}
	
	@And("^Type password 25july24 as \"(.*)\"$")
	public void type_password_as(String pass) 
	{
		lpat.type_pass(pass);
	}
	
	@Then("^Click login button 25july24$")
	public void click_login_button()
	{
		lpat.clickbutton();
	}
	
	@Then("^Click on MyInfo and nevigate to MyInfo page$")
	public void clickonmyinfoandnevigatetomyinfopage()
	{
		mfp.clickMyInfotab();
	}
	
	@Then("^Enter First Name \"(.*)\"$")
	public void enterfirstname(String FName) 
	{
		mfp.EnterEmpFname(FName);
}
	@And("^Enter middle Name \"(.*)\"$")
	public void entermiddlename(String MName)
	{
		mfp.EnterEmpMName(MName);
	}
	
	@And("^Enter Last Name \"(.*)\"$")
	public void enterlastname (String LName)
	{
		mfp.EnterEmpLname(LName);
	}
	
	@Then("^close the browser$")
	public void closethedoor()
	{
		BaseClasstest.getDriver().close();
	}
}