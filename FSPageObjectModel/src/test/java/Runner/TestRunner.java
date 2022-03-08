package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;




//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		
		  features = "C:\\Users\\p-venkataramanaiah\\eclipse-workspace\\FSPageObjectModel\\src\\test\\resources\\Features"
		
				  //features = "C:\\Users\\p-venkataramanaiah\\eclipse-workspace\\FSPageObjectModel\\src\\test\\resources\\Features\\homepage.feature"
//					features = "C:\\Users\\p-venkataramanaiah\\eclipse-workspace\\FSPageObjectModel\\src\\test\\resources\\Features\\deals.feature"
					
		,monochrome = true //Display the Console output in the proper readable format
		,tags = {"@SmokeTest"}
				
		,glue = {"com/qa/stepDefination"},
	  //format = {"pretty", "html:test-output"},
		
		plugin = {"pretty",
						"html:test-output",
						"json:target/MyReport/report.json",
						"junit:target/MyReport/report.xml",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"timeline:test-output-thread/"
						
						},
				
		strict = true, // It will check if any file is not defined in the stepDefination file 
        dryRun = false //To Check the Mapping Between Feature file and stepDefination file
		)
          

public class TestRunner {

}
