package app;

public class LibraryApp {

	public static void main(String[] args) {
        final String appName = "Biblioteka v0.7";
        System.out.printf("%22s", appName);
        LibraryControl libraryControl = new LibraryControl();
        libraryControl.controlLoop();
	}
}