package testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/features/",glue={"stepdefinition"},
        monochrome = true,
        plugin = {"pretty", "json:target/reports/report.json"}
)

public class TestRunner {

}
