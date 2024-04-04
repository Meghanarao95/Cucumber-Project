package StepDefinations;

import java.util.List;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("User navigates to the facebook website")
	public void user_navigates_to_the_facebook_website() {
		System.out.println("@Given(\"User navigates to the facebook website\")");

	}

	@When("User validates the homepage title")
	public void user_validates_the_homepage_title() {
		System.out.println(" @When(\"User validates the homepage title\")");
	}

	@Then("User enters {string} Username")
	public void user_enters_username(String Username) {
		System.out.println("@Then(\"User enters " + Username + "  Username\") ");
	}

	@And("User enters {string}  password")
	public void user_enters_password(String password) {
		System.out.println(" @And(\"User enters " + password + "  password\")");
	}

	

	@And("^user selects the age category$")
	public void user_selects_the_age_category(List<String> list) {
		System.out.println("@And - user selects the age category - "+list.get(2));
	}

	@Then("^User should successfully logged in$")
	public void user_should_successfully_logged_in() {
		System.out.println("@Then - (User  should successfully logged in ");
		
	}

	@Then("^User should not successfully logged in$")
	public void user_should_not_successfully_logged_in() {
		System.out.println("@Then - (User  should successfully logged in ");
		
	}

}
