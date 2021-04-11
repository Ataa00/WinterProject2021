package main;

public class Admin extends User {

	public void addBook(String title,String author,String isbn,String signature)
	{
		int i;
		for( i=0;i<this.getLibrary().size();i++)
		{
			if(((this.getLibrary().get(i)).getSignature()).equals(signature))
			{
				i=-1;
				break;
			}
		}
		if(i!=-1)
		{
			Book book1=new Book(signature,isbn,title,author);
			this.getLibrary().add(book1);
		}
	}
}