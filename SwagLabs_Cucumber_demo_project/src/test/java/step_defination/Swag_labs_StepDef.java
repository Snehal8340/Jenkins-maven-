package step_defination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_action.Swag_labs_PA;
import test_runner_library.Base_class;

public class Swag_labs_StepDef {
	
	Swag_labs_PA slb=new Swag_labs_PA(Base_class.getDriver());
	
	@Given("^I goto browser \"(.*)\" and goto to url \"(.*)\"$")
		public void igotobrowserandgotourl(String choice,String url) {
		slb.launchbrowser(url, choice);
	}
	
	@When("^I write user name as \"(.*)\"$")
	public void iwriteusername(String data) {
		slb.enter_user_name(data);	
	}
	
	@And("^password as \"(.*)\"$")
	public void passwordas(String data) {
		slb.enter_password(data);
	}
	
	@Then("^login should successfull$")
	public void loginsuccessfull() {
		slb.click_login_button();
	}
	
	@Then("^add to cart$")
	public void addtocart()
	{
		slb.clickbagaddtocart();
		slb.clickredbagaddtocart();
	}

	@Then("^checkout$")
	public void checkout() {
		slb.clickCheckout();
	}
	
	@Then("^Enter First name as \"(.*)\"$")
	public void enterfirstnameas(String data) {
		slb.enterFname(data);
	}
	
	@And("^Last name as \"(.*)\"$")
	public void lastname(String data)
	{
		slb.enterLname(data);
	}
	
	@And("^zipcode as \"(.*)\"$")
	public void zipcodeas(String data) {
		slb.enterzipcode(data);
	}
	
	
	@Then("^Continue and finish the process$")
	public void continueandfinishprocess() {
		slb.clickcontinueandfinish();
	}
	
	@Then("^close browser$")
	public void closebrowser()
	{
		slb.closethebrowser();
	}
}

