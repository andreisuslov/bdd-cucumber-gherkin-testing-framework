package com.suslov.bdd.calculator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/calculator",
        glue = "com.suslov.bdd"
)
public class CalculatorTestSuite {

}
