package winter2021;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Admin;

public class loginSteps {
	public Admin admin;
	public loginSteps(Admin a)
	{
		this.admin=a;//picocontainer
	}
	@Given("Admin is log out")
	public void admin_is_log_out() {
	    // Write code here that turns the phrase above into concrete actions
	this.admin.setLog_in(false);

	}

	@When("there Admin logs in by using valid Username as {string} and Password as {string}")
	public void there_admin_logs_in_by_using_valid_username_as_and_password_as(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		
		if(username.equals(this.admin.getUsername())&&password.equals(this.admin.getPassowrd()))
		{

			this.admin.setLog_in(true);
		}
	}

	@Then("login must be successful")
	public void login_must_be_successful() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(this.admin.getLog_in().equals(true));
		
	}

	@When("there Admin logs in by using wrong Password as {string}")
	public void there_admin_logs_in_by_using_wrong_password_as(String password) {
	    // Write code here that turns the phrase above into concrete actions
		if(!(password.equals(this.admin.getPassowrd())))
		{
			this.admin.setLog_in(false);
		}
		}

	@Then("login must be unsuccessful")
	public void login_must_be_unsuccessful() {
	    // Write code here that turns the phrase above into concrete actions
		assertTrue(this.admin.getLog_in().equals(false));

	}
}


