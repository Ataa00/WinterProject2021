package main;

public class Book {
private  String isbn;
private String title;
private String author;
private String signature;
public Book(String signature,String isbn,String title,String author)
{
	this.signature=signature;
	this.isbn=isbn;
	this.title=title;
	this.author=author;	
}
public Book()
{

}
public String getSignature()
{
	return signature;
}

public String getISBN()
{
	return isbn;
}

public String getTitle()
{
	return title;
}

public String getAuthor()
{
	return author;
}
}