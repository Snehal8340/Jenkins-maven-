package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CommonLibrary.CommonMethodstest;

public class MyInfoPageObjecttest extends CommonMethodstest{

	public MyInfoPageObjecttest(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}
	

	public By Myifotab=By.xpath("//a[contains(@href,'viewMyDetails')]");
	public By EmpFName=By.xpath("//input[@name='firstName']");
	public By EmpMName=By.xpath("//input[@name='middleName']");
	public By EmpLName=By.xpath("//input[@name='lastName']");
}
