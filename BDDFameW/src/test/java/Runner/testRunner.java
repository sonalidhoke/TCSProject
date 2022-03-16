package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\ADMIN\\eclipse-workspace\\BDDFameW\\src\\test\\resources\\features\\login.feature"
		,glue= {"stepDefinition"}
		
		)

public class testRunner {

}
