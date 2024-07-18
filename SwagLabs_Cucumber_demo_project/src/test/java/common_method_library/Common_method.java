package common_method_library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test_runner_library.Base_class;


public class Common_method extends Base_class{
	static WebDriver driver = Base_class.getDriver();
	static WebElement element;
	

	public Common_method(WebDriver _driver) {
		super(_driver);
	}
	
	public void clickElement(By reference) 
	{
		element = getDriver().findElement(reference);
		element.click();
	}
	
	public void enterDataInElement(By reference,String data) 
	{
		element = getDriver().findElement(reference);
		element.sendKeys(data);
	}
	
	public void teardownclose()
	{
		getDriver().close();
	}

}
