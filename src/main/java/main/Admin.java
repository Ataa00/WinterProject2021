package main;

import java.util.ArrayList;

public class Admin {
	private String username;
	private String passowrd;
	private Boolean log_in;
	private ArrayList<Book>library=new ArrayList<Book>();

	public Admin()
	{
		this.username="username";
		this.passowrd="password";
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
	public void setPassowrd(String Passowrd)
	{
		this.passowrd=Passowrd;
	}
	public void setLibrary(ArrayList<Book> library){
		this.library = library;
	}
	public ArrayList<Book> getLibrary(){
		return this.library;
	}
	public void AddBook(String Title,String Author,String ISBN,String Signature)
	{
		int i;
		for( i=0;i<library.size();i++)
		{
			if(((library.get(i)).getSignature()).equals(Signature))
				{
				System.out.println("the book is exist");
				 i=-1;
				 break;
				}
		}
		if(i!=-1)
		{
		Book book1=new Book(Signature,ISBN,Title,Author);
		library.add(book1);
	}
	}
	public Boolean FindBook(String Signature)
	{
		int i;
		for( i=0;i<library.size();i++)
		{
			if(((library.get(i)).getSignature()).equals(Signature))
				{
				//the book is exist
				 i=-1;
				 break;
				}
		}
		if(i==-1)
		{
		return true;			//the book is exist

		}
		else {
			return false; 			//the book is not exist

		}

	}
	// Method for searching by title --------------------------------
	public ArrayList<Book> searchTitle(String substring){
		ArrayList<Book> bookSearched = new ArrayList<Book>();
		int books_count=this.library.size();
		for(Book book: library){
			if(book.getTitle().contains(substring)){
				bookSearched.add(book);
			}
		}
		return bookSearched;
	}

	public Boolean getLog_in()
	{
		return log_in;
	}
	public void setLog_in(Boolean log_in)
	{
		this.log_in=log_in;
	}
}
