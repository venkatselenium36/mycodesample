package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
@RunWith(Cucumber.class)
//@CucumberOptions(
		@CucumberOptions(
		
		
		 // features = "C:\\Users\\p-venkataramanaiah\\eclipse-workspace\\FSPageObjectModel\\src\\test\\resources\\Features"
			features = "C:\\Users\\p-venkataramanaiah\\eclipse-workspace\\cucmbertestng\\src\\test\\resources\\Features"
				
					
		,monochrome = true //Display the Console output in the proper readable format
		//,tags = {"@SmokeTest"}
				
		,glue = {"com/qa/stepDefination"},
	    format = {"pretty", "html:test-output"},
		
		plugin = {"pretty",
						"html:test-output",
						"json:target/MyReport/report.json",
						"junit:target/MyReport/report.xml"},
				
		strict = true, // It will check if any file is not defined in the stepDefination file 
        dryRun = false //To Check the Mapping Between Feature file and stepDefination file
		)
          


public class TestRunner {

}
