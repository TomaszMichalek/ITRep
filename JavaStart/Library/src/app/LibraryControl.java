package app;

import data.Book;
import data.Library;
import utils.DataReader;

public class LibraryControl {

	// Zmienne do kontrolowania programu
    public final int exit = 0;
    public final int addBook = 1;
    public final int printBooks = 2;
    
    // Zmienna do komunikacji z u¿ytkownikiem
    private DataReader dataReader;
 
    // "Biblioteka" przechowuj¹ca dane
    private Library library;
    
    public LibraryControl() {
    	dataReader = new DataReader();
    	library = new Library();
    }
    
    // G³ówna pêtla programu, która pozwala na wybór opcji i interakcjê
    public void controlLoop() {
    	int option;
    	printOptions();
    	while ((option = dataReader.getInt()) != exit) {
    		switch (option) {
			case addBook:
				addBook();
				break;
			case printBooks:
				printBooks();
				break;
			default:
				System.out.println("Wrong option!");
			}
    		printOptions();
    	}
    	// Zamykamy strumieñ wejœcia
    	dataReader.close();
    }
    
    private void printOptions() {
    	System.out.println();
        System.out.println("Choose option:");
        System.out.println("0 - Exit program");
        System.out.println("1 - Add new book");
        System.out.println("2 - Books available");
    }
    
    private void addBook() {
    	Book book = dataReader.readAndCreateBook();
    	library.addBook(book);
    }
    
    private void printBooks() {
    	library.printBooks();
    }
}