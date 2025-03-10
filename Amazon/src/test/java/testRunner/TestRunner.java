package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		
		features= "D:\\ALD\\Project\\Amazon\\src\\test\\resources\\features",
				glue = {"com.steps"},
				monochrome=true,
		dryRun=false,
				 plugin = {"pretty", "html:target/cucumber-report.js", "json:target/Cucumber.json"}
		)



public class TestRunner extends AbstractTestNGCucumberTests {

}
