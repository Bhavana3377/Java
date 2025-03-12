package StepDefinition;
import org.testng.Assert;
import Browser.browser;
import Pages.page1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario1 {
	@Given("User opens the Browser")
	public void user_opens_the_browser() throws Exception {
	    browser.openBrowser();
	}

	@Given("User navigates to the {string} Webpage")
	public void user_navigates_to_the_webpage(String str) throws Exception {	
		browser.navigateToUrl(str);
	}

	@Then("User verifies the title of the Webpage")
	public void user_verifies_the_title_of_the_webpage() throws Exception {
		Assert.assertEquals(page1.Title(), "OrangeHRM");    
	}
	@And("User closes the Browser")
	public void user_closes_the_browser() {
	    browser.closeBrowser();   
	}
}



