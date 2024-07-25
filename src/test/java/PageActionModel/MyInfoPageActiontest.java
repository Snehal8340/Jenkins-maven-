package PageActionModel;

import org.openqa.selenium.WebDriver;

import PageObjectModel.MyInfoPageObjecttest;

public class MyInfoPageActiontest extends MyInfoPageObjecttest{

	public MyInfoPageActiontest(WebDriver _driver) {
		super(_driver);
	}
	
	public void clickMyInfotab()
	{
		clickElement(Myifotab);
		
	}
	
	public void EnterEmpFname(String FName) {
		
	//	clearcontentoftextbox(EmpFName);
		
		enterDataInElement(EmpFName,FName);	
	}
	
	public void EnterEmpMName(String MName) {
		
		//clearcontentoftextbox(EmpMName);
		//clickElement(EmpMName);
		enterDataInElement(EmpMName,MName);
		
	}
	
	
	public void EnterEmpLname(String LName) {
		
	//	clearcontentoftextbox(EmpLName);
		enterDataInElement(EmpLName,LName);
	}

}
