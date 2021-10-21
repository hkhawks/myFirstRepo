package runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		// features tell cucumber where all feature files are located
		// glue tells cucumber where all stepDefinitions classes are located
		// with tags we will run one scenario or multiple scenarios or entire feature
		// dryRun checks if there are any missing steps in tepDefinitions class 
		// for each scenario steps in feature file
		// monochrome will make console readable
		// strict will mark scenario failed if there are any pending steps
		// plugin will be used for generating a readable report
		features = "classpath:features", 
		glue = "stepDefinitions",  
		tags = "@endtoendTesting",
		dryRun = false,
		monochrome = true,
		strict = true,
		plugin = {"pretty"},
		publish = true
		)
public class TestRunner {

}
