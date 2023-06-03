package org.nopcommerce;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        dryRun = false,
        strict = true,
        monochrome = true,
        tags =  {"@Test1"},
        plugin = "json:target/cucumber-report/cucumber.json")//this create jason report in target folder

public class RunCukesTest {
        // a json report is generated as target/cucumber-report
//open maven tab and click 'execute maven goal'
//enter 'cluecumber-report:reporting' and click ok to build

//report will be generated in target folder as generated-report
//to run from intellij
}
