package StepDefination;

import PageActionModel.AdminAddPageActiontest;
import PageActionModel.LoginPageActiontest;
import TestRunnerLibrary.BaseClasstest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdmiAddStepDeftest {

	LoginPageActiontest lpat= new LoginPageActiontest(BaseClasstest.getDriver());
	AdminAddPageActiontest adp=new AdminAddPageActiontest(BaseClasstest.getDriver()); 
	
	@Given("^Launch browser to 25july \"(.*)\" and nevigate to url \"(.*)\"$")
	public void launch_browser_and_nevigate_to_url(String choice,String url) {
		lpat.LaunchBrowser(url,choice);
	}
	
	@When("^Type username 25july as \"(.*)\"$")
	public void type_username_as(String username) 
	{
		lpat.type_username(username);
	}
	
	@And("^Type password 25july as \"(.*)\"$")
	public void type_password_as(String pass) 
	{
		lpat.type_pass(pass);
	}
	
	@Then("^Click login button 25july$")
	public void click_login_button()
	{
		lpat.clickbutton();
	}

	@Then("^Click on Admin button and nevigate to Admin page$")
	public void clickadminbutton()
	{
	   adp.clickadmintab();
	}
	
	@And("^Click on Add button$")
	public void clickonaddbutton()
	{
		adp.clickAdd();
	}
	@Then("^Click user role$")
	public void selectuserroleandchoice() {
		adp.clickUserRole();
	}
	
	@And("^Click choice admin$")
	public void clickuserchoice()
	{
		adp.clickUserchoice();
	}
	
	@And("^Enter Emolyee name as \"(.*)\"$")
	public void enteremployenameas(String EmpName)
	{
		adp.EnterEmpName(EmpName);
		
	}
	
	@And("^Choice Employee name$")
	public void choiceempname()
	{
		adp.clickEmpchoice();
	}
	
	@And("^Select Status as enable$")
	public void selectstatusasenable()
	{
		adp.clickStatus();
		adp.clikStatusChoice();
	}
	
	@Then("^Enter User name as \"(.*)\"$")
	public void enterusername(String UName)
	{
		adp.EnterUserName(UName);
	}
	
	@Then("^Enter password as \"(.*)\"$")
	public void enterpasswordas(String Pass) {
		adp.EnterPassword(Pass);
	}
	
	@Then("^Enter Confirm password as \"(.*)\"$")
	public void enterconfirmpasswordas(String Cpass) {
		adp.EnterConfirmPassword(Cpass);
	}
	
	@Then("^Click on save button$")
	public void clickonsavebutton()
	{
		adp.clicksavebutton();
	}
	
	@Then("^Close the browser$")
	public void closethebrowser()
	{
		BaseClasstest.getDriver().close();
	}
}






