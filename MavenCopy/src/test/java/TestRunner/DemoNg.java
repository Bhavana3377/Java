package TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features= "src\\test\\resources\\feature\\Sample2.feature",
glue = {"stepDefination"},
plugin = {"pretty","html:target/cucumberReport/report1.html"})
//tags = ("@SmokeTest or @SystemTest"),
//monochrome=true)
public class DemoNg extends AbstractTestNGCucumberTests{
	}