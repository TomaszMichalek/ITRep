package pl.javastart.sequentional_programming.variables;

public class Zad1 {

	public static void main(String[] args) {
		int cyfra = 2;
		double zmienna = 2.3;
		char znak;
		znak = '%';
		System.out.println(cyfra);
		System.out.println(zmienna);
		System.out.println(znak);
		
		String wyraz1 = "Jestem ";
		String wyraz2 = "sobie ";
		String wyraz3 = "Tomek!";
		String powitanie = wyraz1 + wyraz2 + wyraz3;
		System.out.println(powitanie);
		
		String hejka = powitanie.substring(13, 18) + " Romek i Atomek!";
		System.out.println(hejka + "\nHihihi :)");
	}
}