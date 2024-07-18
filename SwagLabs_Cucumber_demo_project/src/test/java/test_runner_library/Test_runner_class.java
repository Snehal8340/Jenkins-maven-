package test_runner_library;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features="src/test/resources/Feature_File",
		glue={"step_defination"},
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
						}
		,monochrome = true
				//,publish = true		
)
public class Test_runner_class {

}
