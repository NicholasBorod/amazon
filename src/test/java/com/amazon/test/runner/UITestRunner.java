package com.amazon.test.runner;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/feature/Amazon/Amazon.feature",
        glue="com.amazon.test.definitions"
)
public class UITestRunner {}
