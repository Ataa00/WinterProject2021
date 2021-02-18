package winter2021;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Admin;
import main.Book;

import java.util.ArrayList;

public class SearchSteps {

    public Admin admin;
    public String substring;// the subtitle which the user or admin will inter to search a book
    char type;//Search type as author, title or ISBN

    public SearchSteps(Admin a){
        this.admin = a;
    }
    @Given("Library has nine books")
    public void library_has_nine_books() {

        this.admin.AddBook("A Promised Land","President Barack Obama","0241491517","s1");
        this.admin.AddBook("Mythology","Edith Hamilton","0316438529","s3");
        this.admin.AddBook("A Life on Our Planet","David Attenborough","1529108276","s2");
        this.admin.AddBook("A Promised Land","aul Rusesabagina","0143038605","s4");
        this.admin.AddBook("An Ordinary Man : An Autobiography","Paul Rusesabagina","143038605","s5");
        this.admin.AddBook("The New Jim Crow","Michelle Alexander","1620971933","s6");
        this.admin.AddBook("Concepts of Programming Languages","Robert Sebesta","1292100559","s7");
        this.admin.AddBook("Beginning Programming All-in-One Desk Reference For Dummies","Wallace Wang","0470108541","s8");
        this.admin.AddBook("Programming : Principles and Practice Using C++","Bjarne Stroustrup","0321992784","s9");
        this.admin.AddBook("CPractice of Programming","Rob Pike","1118714709","s10");
    }

    @When("I type substring {string} of a title as {string}")
    public void i_type_substring_of_a_title_as(String substring, String type) {

        this.substring = substring;
        this.type = type.charAt(0);

    }

    @Then("I will see {int} Books which their title contains the substring")
    public void i_will_see_books_which_their_title_contains_the_substring(int int1) {

        ArrayList<Book> bookSearched = new ArrayList<Book>();
         bookSearched.addAll(this.admin.searchEngin(this.substring, this.type));
        assertEquals(int1, bookSearched.size());
    }

    // the second scenario -----------------------
    @When("I type substring {string} of an Author name as {string}")
    public void i_type_substring_of_an_author_name_as(String substring, String type) {

        this.substring = substring;
        this.type = type.charAt(0);
    }

    @Then("I will see  {int} Authors which their name contains the substring")
    public void i_will_see_authors_which_their_name_contains_the_substring(Integer int1) {

        ArrayList<Book> bookSearched = new ArrayList<Book>();
        bookSearched.addAll(this.admin.searchEngin(this.substring, this.type));
        assertEquals(int1.intValue(), bookSearched.size());

    }

    @When("I type substring {string} of an ISBN as {string}")
    public void i_type_substring_of_an_isbn_as(String substring, String type) {

        this.substring = substring;
        this.type = type.charAt(0);

    }

    @Then("I will see {int} Books which their ISBN contains the substring")
    public void i_will_see_books_which_their_isbn_contains_the_substring(Integer int1) {
        ArrayList<Book> bookSearched = new ArrayList<Book>();
        bookSearched.addAll(this.admin.searchEngin(this.substring, this.type));
        assertEquals( int1.intValue(), bookSearched.size());

    }

}
