package main;

public class Book {
private  String ISBN;
private String Title;
private String Author;
public String Signature;
public Book(String Signature,String ISBN,String Title,String Author)
{
	this.Signature=Signature;
	this.ISBN=ISBN;
	this.Title=Title;
	this.Author=Author;	
}
public Book()
{

}
public String getSignature()
{
	return Signature;
}

public String getISBN()
{
	return ISBN;
}

public String getTitle()
{
	return Title;
}

public String getAuthor()
{
	return Author;
}
}