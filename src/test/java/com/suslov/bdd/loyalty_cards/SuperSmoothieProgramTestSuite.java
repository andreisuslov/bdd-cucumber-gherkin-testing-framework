package com.suslov.bdd.loyalty_cards;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features/loyalty_cards",
        glue = "com.suslov.bdd"
)
public class SuperSmoothieProgramTestSuite {
}
