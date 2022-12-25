package es.com.nike.Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features",
        tags = {"@Login, @Car, @Product"},
        glue = "es.com.nike.StepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class GeneralRunner {
}
