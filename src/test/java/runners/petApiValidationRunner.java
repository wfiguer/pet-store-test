package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/features/petsApiValidation.feature",
        glue = "stepDefinitions",
        tags = "@AllFeatures"
)
public class petApiValidationRunner {
    public petApiValidationRunner() {
    }
}
