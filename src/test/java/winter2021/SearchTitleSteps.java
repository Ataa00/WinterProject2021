package winter2021;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Admin;
import main.Book;

import java.util.ArrayList;

public class SearchTitleSteps {
    public Admin admin;
    public String substring;// the subtitle which the user or admin will inter to search a book
    public SearchTitleSteps(Admin a){
        this.admin = a;
    }
    @Given("Library has several books")
    public void library_has_several_books() {
        ArrayList<Book> b = new ArrayList<Book>();
        Book a1 = new Book("s1","0241491517","A Promised Land","President Barack Obama");
        b.add(a1);
        Book a2 = new Book("s3","0316438529","Mythology","Edith Hamilton");
        b.add(a2);
        Book a3 = new Book("s2","1529108276","A Life on Our Planet","David Attenborough");
        b.add(a3);
        Book a4 = new Book("s4","0143038605","A Promised Land","aul Rusesabagina");
        b.add(a4);
        Book a5 = new Book("s5","143038605","An Ordinary Man : An Autobiography","Paul Rusesabagina");
        b.add(a5);
        Book a6 = new Book("s6","1620971933","The New Jim Crow","Michelle Alexander");
        b.add(a6);
        Book a7 = new Book("s7","1292100559","Concepts of Programming Languages, Global Edition","Robert Sebesta");
        b.add(a7);
        Book a8 = new Book("s8","0470108541","Beginning Programming All-in-One Desk Reference For Dummies","Wallace Wang");
        b.add(a8);
        Book a9 = new Book("s9","0321992784","Programming : Principles and Practice Using C++","Bjarne Stroustrup");
        b.add(a9);
        Book a10 = new Book("s10","1118714709","CPractice of Programming","Rob Pike");
        b.add(a10);
        this.admin.setLibrary(b);
    }

    @When("I type substring {string} of a title")
    public void i_type_substring_of_a_title(String string) {
        this.substring = "Programming";
    }

    @Then("I will see Books which their title contains the substring")
    public void i_will_see_books_which_their_title_contains_the_substring() {
        ArrayList<Book> bookSearched = new ArrayList<Book>();
        for(Book b : this.admin.getLibrary()){
            if(b.getTitle().contains(this.substring)){
                bookSearched.add(b);
            }
        }
        assertEquals(4, bookSearched.size());
    }
}
