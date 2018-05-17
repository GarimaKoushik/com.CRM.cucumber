package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/main/java/Features/",
		glue= {"src/main/java/stepDefinition/"},
		monochrome=false
		
		)

public class TestRunner {

}
