package winter2021;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Admin;

public class AddBookSteps {
	public Admin admin;
	String sign;
	public AddBookSteps(Admin a)
	{
		this.admin=a;//picocontainer
	}
	@When("there Admin Wants add book with Title {string} Author {string} Signature {string} and valid ISBN-{int} {string}")
	public void there_admin_wants_add_book_with_title_author_signature_and_valid_isbn(String title, String author, String signature,Integer int1, String ISBN) {
	    // Write code here that turns the phrase above into concrete actions
this.sign=signature;
int sum=0;
char[] isb = new char[ISBN.length()];//convert isbn to string of char
int j=10;
for (int i = 0; i <ISBN.length(); i++) { 
    isb[i] = ISBN.charAt(i); 
    sum+=(j--)*(Integer.parseInt(String.valueOf(isb[i])));//sum of numbers isbn*i
} 
if((sum%11==0)&&this.admin.getLog_in())//valid isbn
{
this.admin.AddBook(title, author, ISBN, signature);
}
	}

	@Then("AddBook must be successful with valid ISBN-{int}")
	public void add_book_must_be_successful_with_valid_isbn(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
        Boolean f=this.admin.FindBook(this.sign);
		assertTrue(f.equals(true));//book added
	}

	@Given("Admin is logout")
	public void admin_is_logout() {
	    // Write code here that turns the phrase above into concrete actions
		this.admin.setLog_in(false);
	}

	@Then("AddBook must be unsuccessful")
	public void add_book_must_be_unsuccessful() {
	    // Write code here that turns the phrase above into concrete actions
        Boolean f=this.admin.FindBook(this.sign);
		assertTrue(f.equals(false));//book not added
	}
// function to connect the admin from this class to the other classes

}
