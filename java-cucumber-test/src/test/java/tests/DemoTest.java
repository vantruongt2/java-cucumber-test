package tests;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/features/demo.feature" }, glue = { "steps" })
public class DemoTest extends AbstractTestNGCucumberTests {

}
