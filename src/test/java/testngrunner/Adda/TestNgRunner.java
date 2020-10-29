package testngrunner.Adda;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Features",
		glue="stepDefinition.Adda"
)

public class TestNgRunner extends AbstractTestNGCucumberTests{	
	
}
