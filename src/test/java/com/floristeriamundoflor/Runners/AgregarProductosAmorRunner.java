package com.floristeriamundoflor.Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features",
        tags="@AgregarProductosAmor",
        glue = "com.floristeriamundoflor.StepDefinitions",
        snippets = SnippetType.UNDERSCORE
)
public class AgregarProductosAmorRunner {
}
