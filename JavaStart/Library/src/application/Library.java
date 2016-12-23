package application;

// Stwórz i zoptymalizuj aplikacjê "Biblioteka", pozwalaj¹cej przechowywaæ i wyœwietlaæ informacje na temat stanu zasobów.

import data.Book;

public class Library {

	public static void main(String[] args) {
        final String appName = "Biblioteka v0.4";
        
        Book books[] = new Book[1000];
        books[0] = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, 296, "Greg",
                "9788373271890");
        books[1] = new Book("Java! Efektywne programowanie (Wydanie II)", " Joshua Bloch", 2009,
                352, "Helion", "9788324620845");
        books[2] = new Book("SCJP Sun Certified Programmer for Java 6 Study Guide",
                "Bert Bates, Katherine Sierra", 2008, 851, "McGraw-Hill Osborne Media",
                "9780071591065");
 
        System.out.printf("%22s", appName);
        System.out.println();
        System.out.println("Ksi¹¿ki dostêpne w bibliotece:");
        System.out.println();
        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();
        System.out.println();
        System.out.println("Liczba ksi¹¿ek w bibliotece: " + books.length);
	}
}