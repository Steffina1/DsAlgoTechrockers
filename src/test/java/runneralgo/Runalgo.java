package runneralgo;


import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/algoreg.html"},
		features = {"src/test/resources/feature"},
	
		glue = {"stepdefinition"})
		

public class Runalgo extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel = false) 
		public Object[][] scenarios() {
		return super.scenarios();
		
	}
	
	
	
	
	

	
}
