package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features= "src/test/resources/features/selenium.feature",
		glue = {"com.steps", "hookSelenium"},  
		
		monochrome=true,
	//dryRun=true,
		plugin = {"pretty", "html:target/cucumber-report.html", "json:target/Cucumber.json", "rerun:target/failedrerun.txt"}

		)

public class RunnerClass extends AbstractTestNGCucumberTests{



}
