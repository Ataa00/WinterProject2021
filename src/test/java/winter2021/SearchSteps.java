package winter2021;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Admin;
import main.Book;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SearchSteps {

    public Admin admin;
    public String substring;// the subtitle which the user or admin will inter to search a book

    public SearchSteps(Admin a){
        this.admin = a;
    }
    @Given("Library has nine books")
    public void library_has_nine_books() {

        this.admin.addBook("A Promised Land","President Barack Obama","0241491517","s1");
        this.admin.addBook("Mythology","Edith Hamilton","0316438529","s3");
        this.admin.addBook("A Life on Our Planet","David Attenborough","1529108276","s2");
        this.admin.addBook("A Promised Land","aul Rusesabagina","0143038605","s4");
        this.admin.addBook("An Ordinary Man : An Autobiography","Paul Rusesabagina","143038605","s5");
        this.admin.addBook("The New Jim Crow","Michelle Alexander","1620971933","s6");
        this.admin.addBook("Concepts of Programming Languages","Robert Sebesta","1292100559","s7");
        this.admin.addBook("Beginning Programming All-in-One Desk Reference For Dummies","Wallace Wang","0470108541","s8");
        this.admin.addBook("Programming : Principles and Practice Using C++","Bjarne Stroustrup","0321992784","s9");
        this.admin.addBook("CPractice of Programming","Rob Pike","1118714709","s10");
    }

    @When("I type substring {string} of a title")
    public void i_type_substring_of_a_title(String substring) {

        this.substring = substring;

    }

    @Then("I will see {int} Books which their title contains the substring")
    public void i_will_see_books_which_their_title_contains_the_substring(int int1) {

        ArrayList<Book> bookSearched = new ArrayList<Book>();
         bookSearched.addAll(this.admin.searchTitle(this.substring));
        assertEquals(int1, bookSearched.size());
    }

    // the second scenario -----------------------
    @When("I type substring {string} of an Author name")
    public void i_type_substring_of_an_author_name(String substring) {

        this.substring = substring;
    }

    @Then("I will see  {int} Authors which their name contains the substring")
    public void i_will_see_authors_which_their_name_contains_the_substring(Integer int1) {

        ArrayList<Book> bookSearched = new ArrayList<Book>();
        bookSearched.addAll(this.admin.searchAuthor(this.substring));
        assertEquals(int1.intValue(), bookSearched.size());

    }

    @When("I type substring {string} of an ISBN")
    public void i_type_substring_of_an_isbn(String substring) {

        this.substring = substring;

    }

    @Then("I will see {int} Books which their ISBN contains the substring")
    public void i_will_see_books_which_their_isbn_contains_the_substring(Integer int1) {
        ArrayList<Book> bookSearched = new ArrayList<Book>();
        bookSearched.addAll(this.admin.searchISBN(this.substring));
        assertEquals( int1.intValue(), bookSearched.size());

    }
    //Scenario 4 --------------------------------------------------------------


    @Given("User or Admin has logedin and the library has several books")
    public void user_or_admin_has_logedin_and_the_library_has_several_books() {
        this.admin.addBook("A Promised Land","President Barack Obama","0241491517","s1");
        this.admin.addBook("Mythology","Edith Hamilton","0316438529","s3");
        this.admin.addBook("A Life on Our Planet","David Attenborough","1529108276","s2");
        this.admin.addBook("A Promised Land","aul Rusesabagina","0143038605","s4");
        this.admin.addBook("An Ordinary Man : An Autobiography","Paul Rusesabagina","143038605","s5");
        this.admin.addBook("The New Jim Crow","Michelle Alexander","1620971933","s6");
        this.admin.addBook("Concepts of Programming Languages","Robert Sebesta","1292100559","s7");
        this.admin.addBook("Beginning Programming All-in-One Desk Reference For Dummies","Wallace Wang","0470108541","s8");
        this.admin.addBook("Programming : Principles and Practice Using C++","Bjarne Stroustrup","0321992784","s9");
        this.admin.addBook("CPractice of Programming","Rob Pike","1118714709","s10");
        this.admin.setLog_in(true);

    }

    @When("Insert a substring as {string} of a title")
    public void insert_a_substring_as_of_a_title(String substring) {

        this.substring = substring;

    }

    @Then("It must show {int} Books")
    public void it_must_show_books(Integer int1) {
        ArrayList<Book> bookSearched = new ArrayList<Book>();
        bookSearched.addAll(this.admin.searchTitle(this.substring));
        assertEquals( int1.intValue(), bookSearched.size());
        assertEquals(this.admin.getLog_in(),true);
    }

    //Scenario 5 -----------------------------------------------------------------
    @When("Insert a substring as {string} of a author")
    public void insert_a_substring_as_of_a_author(String substring) {

        this.substring = substring;

    }

    @Then("It will show {int} Books")
    public void it_will_show_books(Integer int1) {
        ArrayList<Book> bookSearched = new ArrayList<Book>();
        bookSearched.addAll(this.admin.searchAuthor(this.substring));
        assertEquals( int1.intValue(), bookSearched.size());
    }

    //Scenario 6 ------------------------------------------------------------
    @When("Insert a substring as {string} of an title")
    public void insert_a_substring_as_of_an_title(String substring) {
        this.substring = substring;
    }
    @Then("It will show {int} books as contains the substring of the title")
    public void it_will_show_books_as_contains_the_substring_of_the_title(Integer int1) {
        ArrayList<Book> bookSearched = new ArrayList<Book>();
        bookSearched.addAll(this.admin.searchTitle(this.substring));
        assertEquals( int1.intValue(), bookSearched.size());
    }

}
