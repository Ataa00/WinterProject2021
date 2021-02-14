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
public void setISBN(String ISBN)
{
	this.ISBN=ISBN;
}
public String getISBN()
{
	return ISBN;
}
public void setTitle(String Title)
{
	this.Title=Title;
}
public String getTitle()
{
	return Title;
}
public void setAuthor(String Author)
{
	this.Author=Author;
}
public String getAuthor()
{
	return Author;
}
}