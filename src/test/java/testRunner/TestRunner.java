package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeatures"},
		glue= {"stepDefination"},
		tags="@LoginPage"
		
		
	)
public class TestRunner  {

}
