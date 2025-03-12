package StepDefinition;

import org.testng.Assert;

import Pages.page1;
import Pages.page2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scenario2 {
	@When("user enters {string} username")
	public void user_enters_username(String string) throws InterruptedException {
	    page1.userNameEnter(string);
	}

	@And("user enters'admin123' password")
	public void user_enters_admin123_password() throws InterruptedException {
	   page1.passwordEnter("admin123");
	}

	@And("user clicks login button")
	public void user_clicks_login_button() throws InterruptedException {
	   page1.clickOnLogin();
	}

	@Then("user verifies the profile account")
	public void user_verifies_the_profile_account() throws InterruptedException {
		Assert.assertEquals(page2.Username(), "a edited Last Name");
	}
}
