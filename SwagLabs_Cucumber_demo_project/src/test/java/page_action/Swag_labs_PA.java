package page_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import page_object.Swag_labs_PO;
import test_runner_library.Base_class;

public class Swag_labs_PA extends Swag_labs_PO {

	public Swag_labs_PA(WebDriver _driver) {
		super(_driver);
	}
	
	static WebDriver driver = Base_class.getDriver();
	
	public void enter_user_name(String data) {
		enterDataInElement(username,data);
	}
		
	public void enter_password(String data) {
		enterDataInElement(password, data);
	}
	
	public void click_login_button() {
		clickElement(login);
	}
	
	public void clickbagaddtocart() {
		clickElement(viewbagbutton);
		clickElement(bagAddtocartbutton);
		clickElement(backToCartButton);
	}
	
	public void clickredbagaddtocart()
	{
		clickElement(redshieraddtocartbutton);
		clickElement(opencartbutton);
	}
	
	public void clickCheckout() {
		clickElement(checkoutbutton);
	}
	
	public void enterFname(String data) {
		enterDataInElement(firstnametext,data);
	}
		
	public void enterLname(String data) {
		enterDataInElement(lastnametext,data);
		}
	
	public void enterzipcode(String data) {
		enterDataInElement(zipcodetext,data);
	}
	
	public void clickcontinueandfinish() {
		clickElement(cotinuebutton);
		clickElement(finishbutton);
	}
	
	public void closethebrowser() {
		teardownclose();
	}
	
	

}
