package bddtests.utils;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:bddtests"},
        strict = true,
        format = {"pretty"})

public class RunCukesTest {
}
