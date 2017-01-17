package data;

public class Library {
	
	public final int maxBooks = 1000;
	private Book[] books;
	private int booksNumber;
	
	public int getBooksNumber() {
		return booksNumber;
	}
	
	public Book[] getBooks() {
		return books;
	}
	
	public Library() {
		books = new Book[maxBooks];
	}
	
	public void addBook(Book book) {
		if (booksNumber < maxBooks) {
			books[booksNumber] = book;
			booksNumber++;
		} else {
			System.out.println("Number of books reach maximum value!");
		}
	}
	
	public void printBooks() {
		if (booksNumber == 0) {
			System.out.println("There are no books in library.");
		}
		for (int i=0; i < booksNumber; i++) {
			books[i].printInfo();
		}
	}
}