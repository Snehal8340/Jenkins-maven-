package PageActionModel;

import org.openqa.selenium.WebDriver;

import PageObjectModel.AdminAddPageObjecttest;

public class AdminAddPageActiontest extends AdminAddPageObjecttest {

	public AdminAddPageActiontest(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickadmintab()
	{
		clickElement(admintab);
		
	}
	
	public void clickAdd() {
		
		clickElement(adminAdd);
	}
	
	public void clickUserRole(){
		
		clickElement(adminUserRole);
	}
	
	public void clickUserchoice(){
		clickElement(adminUserRoleChoice);
		
	}
	
	public void EnterEmpName(String EmpName){
		
		enterDataInElement(adminEmpName,EmpName);
		
	}
	
	public void clickEmpchoice()
	{
		clickElement(adminEmpNameChoice);
	}
	
	public void clickStatus() {
		
		clickElement(adminStatus);
	}
	
	public void clikStatusChoice() {
		
		clickElement(adminStatusChoice);
	}
	
	public void EnterUserName(String UName){
		
		enterDataInElement(adminUserName, UName);
	}
	
	public void EnterPassword(String Pass) {
		
		enterDataInElement(adminPassword, Pass);
	}
	
	public void EnterConfirmPassword(String CPass){
		
		enterDataInElement(adminConfirmPassword, CPass);
	}
	
	public void clicksavebutton()
	{
		clickElement(adminSave);
	}
}
