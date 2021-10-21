package stepDefinitions;
import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base {

	
	// in this class we will define Before Hooks and After Hooks of Cucumber
	// Before hooks will run before each scenario 
	// After hooks will run after each scenario 
	
	@Before
	public void bforeHooks(Scenario scenario) {
		
		logger.info("Scenario" + scenario.getName()+ "Started");
		browser(); // this method comes from Base class and launches browser 
		openBrowser(); // this method comes from Base class and will launch url
		
		
		
	}
	
	@After
	public void afterHooks(Scenario scenario) {
		tearDown();
		logger.info("Scenario" + scenario.getName() + " " + scenario.getStatus());
		
		
	}
}
