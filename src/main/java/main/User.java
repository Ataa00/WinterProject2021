package main;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String passowrd;
    private Boolean logIn;
    private List<Book> library;

    public User()
    {
        this.username="username";
        this.passowrd="password";
        this.logIn = false;
        this.library = new ArrayList<Book>();
    }

    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username=username;
    }
    public String getPassowrd()
    {
        return passowrd;
    }
    public void setPassowrd(String passowrd)
    {
        this.passowrd=passowrd;
    }
    public List<Book> getLibrary(){
        return this.library;
    }

    public Boolean findBook(String signature)
    {
        int i;
        for( i=0;i<library.size();i++)
        {
            if(((library.get(i)).getSignature()).equals(signature))
            {
                //the book is exist
                i=-1;
                break;
            }
        }
        //the book is not exist
        return i == -1;			//the book is exist

    }

    // SearchEngin method to search by title as 't' or author as 'a' or ISBN as 'i' --------------------------------
    public List<Book> searchTitle(String substring){
        ArrayList<Book> bookSearched = new ArrayList<Book>();
        for (Book book : this.getLibrary()) {
            if (book.getTitle().contains(substring)) {
                bookSearched.add(book);
            }
        }
        return bookSearched;
    }
    public List<Book> searchAuthor(String substring){
        ArrayList<Book> aouthorSearched = new ArrayList<Book>();
        for (Book book : this.getLibrary()) {
            if (book.getAuthor().contains(substring)) {
                aouthorSearched.add(book);
            }
        }
        return aouthorSearched;
    }
    public List<Book> searchISBN(String substring){
        ArrayList<Book> isbnSearched = new ArrayList<Book>();
        for (Book book : this.getLibrary()) {
            if (book.getISBN().contains(substring)) {
                isbnSearched.add(book);
            }
        }
        return isbnSearched;
    }

    public Boolean getLogIn()
    {
        return logIn;
    }
    public void setLogIn(Boolean logIn)
    {
        this.logIn = logIn;
    }
}