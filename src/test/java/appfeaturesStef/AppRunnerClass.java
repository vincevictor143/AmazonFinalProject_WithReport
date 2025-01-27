package appfeaturesStef;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features={"src\\test\\resources\\appfeatures"},
		glue={"appfeaturesStef"},
		plugin={"pretty",
				"html:target/cucumber-reports/amazonreports.html",
				"json:target/cucumber-report.json"}
		
	
)

public class AppRunnerClass extends AbstractTestNGCucumberTests 
{
	
}
