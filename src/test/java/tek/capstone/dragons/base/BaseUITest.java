package tek.capstone.dragons.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import tek.capstone.dragons.utilities.CommonUtility;




public class BaseUITest extends CommonUtility{
	// in the BaseUItest we only need to lunch browser and close browser and
		// in case test fails take screenshot of that fails 
		
		/*
		 * @Before hook
		 * @Before is a cucumber hook and we can setup the block of code under this 
		 * cucumber annotation under any class, but for the purpose of our test automation
		 * framework, we will setup the @Before hook in our BaseUITest class
		 * @After hook
		 * @After is a cucumber hook and we can setup the block of code under this cucumber
		 * annotation under any class, but for the purpose of our test automation
		 * framework, we will setup the @Before hook in our BaseUITest class
		 */
		
		/*
		 * Using Scenario class from Cucumber, we can pass this in our @After hook method
		 * parameter, so that just in case the test step fails and scenarios fails, 
		 * we can take a screenshot for that failed test step.
		 */
		
		@Before
		//here we create a one method and black of code that we have under 
		//this method will be executed before every scenario
		
		public void setupTests() {
			super.setupBrowser();
		}
		
		@After
		public void closeTests(Scenario scenario) {
			//we need to write our code to check and see and scenario is failed,
			//it should take a screenshot and attach it to our test report
			if(scenario.isFailed()) {
				byte[] screenshot = takeScreenShotAsBytes();
				scenario.attach(screenshot, "image/png", scenario.getName() + " scenario failed");
			}
			super.quitBrowser();
		}
}
