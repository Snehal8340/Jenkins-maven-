package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common_method_library.Common_method;
import test_runner_library.Base_class;


public class Swag_labs_PO extends Common_method{
	
	public Swag_labs_PO(WebDriver _driver) {
		super(_driver);
	}
	
	static WebDriver driver = Base_class.getDriver();

	public By username=By.id("user-name");
	public By password=By.id("password");
	public By login=By.id("login-button");
	public By viewbagbutton=By.xpath("//div[contains(text(),'Backpack')]");
	public By bagAddtocartbutton=By.id("add-to-cart");
	public By backToCartButton=By.id("back-to-products");
	public By redshieraddtocartbutton=By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
	public By opencartbutton=By.xpath("//span[@class='shopping_cart_badge']");
	public By checkoutbutton=By.id("checkout");
	public By firstnametext=By.xpath("//input[@id='first-name']");
	public By lastnametext=By.xpath("//input[@id='last-name']");
	public By zipcodetext=By.xpath("//input[@id='postal-code']");
	public By cotinuebutton=By.id("continue");
	public By finishbutton=By.id("finish");
}