package winter2021;

import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="use_cases",glue="winter2021",strict=true)
public class TestLogin {

}
