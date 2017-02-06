package Store;

public class Book {
	
	private String author;
	private int numberOfPages;
	private int id;
	
	public Book(String author, int numberOfPages, int id) {
		super();
		this.author = author;
		this.numberOfPages = numberOfPages;
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
