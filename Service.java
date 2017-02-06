package Store;

import java.util.HashMap;
import java.util.Map;

public abstract class Service {
	
	static Map<Integer, Book> bookList = new HashMap();
	 
	 public static void addBook(String author, int numberOfPages, int id){
		 Book newBook = new Book(author, numberOfPages, id);
			bookList.put(bookList.size()+1, newBook);
		}	
	 
	 public static void removeBook(int i){
		 bookList.remove(i);
		 
	 }

}

