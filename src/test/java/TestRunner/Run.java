package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\WorkSapace\\CucumberFramwork\\Features\\Flipkart.feature",
		glue="StepDefination",
		monochrome=true,
		tags="@sainty",
		plugin= {"pretty","html:target/cucmber-reports/reports1.html"}
		
		
		)

public class Run {

}
