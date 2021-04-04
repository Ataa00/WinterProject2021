package main;
//import java.util.logging.Level;
//import java.util.logging.Logger;
public class Admin extends User {
//	private final static Logger LOGGER = 
           // Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	public void addBook(String title,String author,String isbn,String signature)
	{
		int i;
		for( i=0;i<this.getLibrary().size();i++)
		{
			if(((this.getLibrary().get(i)).getSignature()).equals(signature))
			{
		      //  LOGGER.log(Level.INFO, "the book is exist");
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