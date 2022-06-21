package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/automationPractice.feature",
        glue="stepdefinitions",
        snippets=SnippetType.CAMELCASE
        , tags = "not @Not")
public class TestRunnerParallel extends BrowserStackSerenityTest{
 //  @BeforeClass
 //  public static void parallel() {
 //      System.out.println("ingresó");
 //      EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
 //      environmentVariables.setProperty("environment","parallel_2");
 //  }
}
