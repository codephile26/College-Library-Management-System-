package edu.library.term.dao;
import edu.library.term.model.Book;

public interface BookDAO {

	public Book findBookByISBN(String isbn);

	public Book saveNewBook(Book book);
	
	public void updateBook(Book book);
	
	public void deleteBookByISBN(String isbn);
	
	//public List<Book> findAllBooks();
}
