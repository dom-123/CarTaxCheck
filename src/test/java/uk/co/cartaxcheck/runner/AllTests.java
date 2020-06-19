package uk.co.cartaxcheck.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "uk.co.cartaxcheck.steps",
        features = ("src/test/java/uk/co/cartaxcheck/feature"),
        plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"}
)


public class AllTests {

}
