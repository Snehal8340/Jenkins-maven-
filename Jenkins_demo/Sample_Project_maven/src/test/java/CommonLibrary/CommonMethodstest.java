package CommonLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import TestRunnerLibrary.BaseClasstest;


public class CommonMethodstest extends BaseClasstest {

	

	public CommonMethodstest(WebDriver _driver) {
		super(_driver);
		// TODO Auto-generated constructor stub
	}

	static WebDriver driver=BaseClasstest.getDriver();
	static WebElement element;
	static Select select;
	static Actions actions;
	
	
	public void enterDataInElement(By reference, String data) {
		element=getDriver().findElement(reference);
		element.sendKeys(data);
	}
	
	public void clickElement(By reference) {
		element=getDriver().findElement(reference);
		element.click();	
		}
	
	public void scrolltillelement(By referance)
	{
		JavascriptExecutor js=(JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].scrollIntoView();",getDriver().findElement(referance));
		}
	
	public void selectDropDownValueUsing(By reference,String choice,int index,String value,String visibleText)
	{
		select = new Select(getDriver().findElement(reference));
		
		switch (choice) {
		case "index": {
			select.selectByIndex(index);
		}
		break;
		case "value":{
			select.selectByValue(value);
		}
		break;
		case "visibletext":{
			select.selectByVisibleText(visibleText);
		}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}
	}
	
	public void teardown() {
		getDriver().quit();
	}


}
	
