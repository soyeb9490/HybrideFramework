package testngrunner.Adda;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Features",
		glue="stepDefinition.Adda",
		monochrome = true,
		tags= {"@SmokeTest,@FunctioanTest1,@FunctioanTest2"}
)

public class TestNgRunner extends AbstractTestNGCucumberTests{	
	
}