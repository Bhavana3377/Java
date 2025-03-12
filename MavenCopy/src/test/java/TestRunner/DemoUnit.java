package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\Sample2.feature", 
glue = {"StepDefinition"},
plugin= {"junit:target/JunitReport/report.xml"})
public class DemoUnit {
	

}
