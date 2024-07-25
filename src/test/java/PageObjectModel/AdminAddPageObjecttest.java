package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonLibrary.CommonMethodstest;

public class AdminAddPageObjecttest extends CommonMethodstest {

	public AdminAddPageObjecttest(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	
public By admintab=By.xpath("//a[contains(@href,'admin')]");
	
	public By adminAdd=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
	
	public By adminUserRole=By.xpath("//label[contains(text(),'User Role')]//parent::div//following-sibling::div//div//div[@class='oxd-select-text oxd-select-text--active']");
	
	public By adminUserRoleChoice=By.xpath("//div[@role='option']//span[text()='Admin']");
	
	public By adminEmpName=By.xpath("//input[@placeholder='Type for hints...']");
	
	public By adminEmpNameChoice=By.xpath("//div[@role='option']//span[text()='Ranga  Akunuri']");

	public By adminStatus=By.xpath("//label[text()='Status']//parent::div//following-sibling::div//div[@class='oxd-select-text oxd-select-text--active']");
	
	public By adminStatusChoice=By.xpath("//div[@role='option']//span[text()='Enabled']");
	
	public By adminUserName=By.xpath("//label[contains(text(),'Username')]//parent::div//following-sibling::div//input[@class='oxd-input oxd-input--active']");
	
	public By adminPassword=By.xpath("//label[text()='Password']//parent::div//following-sibling::div//input[@type='password']");
	
	public By adminConfirmPassword=By.xpath("//label[text()='Confirm Password']//parent::div//following-sibling::div//input[@type='password']");
	
	public By adminSave=By.xpath("//button[@type='submit']");

}
