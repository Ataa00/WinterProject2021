package main;

import io.cucumber.java.bs.A;

import java.util.ArrayList;

public class Admin extends User {
	public Admin()
	{

	}

	public void AddBook(String Title,String Author,String ISBN,String Signature)
	{
		int i;
		for( i=0;i<this.getLibrary().size();i++)
		{
			if(((this.getLibrary().get(i)).getSignature()).equals(Signature))
			{
				System.out.println("the book is exist");
				i=-1;
				break;
			}
		}
		if(i!=-1)
		{
			Book book1=new Book(Signature,ISBN,Title,Author);
			this.getLibrary().add(book1);
		}
	}
}