package winter2021;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Admin;

public class logoutSteps {
	public Admin admin;
	public logoutSteps(Admin a)
	{
		this.admin=a;//picocontainer
	}
	@Given("Admin is login")
	public void admin_is_login() {
	    // Write code here that turns the phrase above into concrete actions
		this.admin.setLog_in(true);
	}

	@When("there Admin logout by clik button logout")
	public void there_admin_logout_by_clik_button_logout() {
	    // Write code here that turns the phrase above into concrete actions
		this.admin.setLog_in(false);
	}

	@Then("logout must be successful")
	public void logout_must_be_successful() {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(this.admin.getLog_in(),false);

	}
}
