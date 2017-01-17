package hospital;

import java.util.Scanner;

/*
Napisz program symuluj�cy system do planowania wizyt w szpitalu. Program powinien sk�ada� si� z trzech klas:
- Patient - klasa przechowuj�ca dane o pacjencie (imi�, nazwisko, PESEL) - klasa powinna by� zgodna z konwencj� JavaBeans
- Hospital - klasa z logik� aplikacji umo�liwiaj�ca dopisanie pacjenta do kolejki oraz wy�wietlenie wszystkich zapisanych pacjent�w
- HospitalApp - klasa startowa programu, kt�ra posiada trzy opcje: 0 - wyj�cie z programu, 1 - dopisanie pacjenta, 2 - wy�wietlenie listy pacjent�w

Ograniczenia:
Danego dnia mo�e zapisa� si� co najwy�ej 10 pacjent�w, przy pr�bie zapisania kolejnego wy�wietlana jest informacja o tym, 
�e dzisiaj limit zosta� ju� wyczerpany. Aplikacja powinna dzia�a� do tego momentu, a� u�ytkownik nie wybierze opcji 0, czyli wyj�cia z programu.
*/

public class HospitalApp {
	public static final int EXIT = 0;
	public static final int ADD_PATIENT = 1;
	public static final int PRINT_PATIENTS = 2;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option = -1;
		
		Hospital hospital = new Hospital();
		
		while (option != EXIT) {
			System.out.println("Options available:");
			System.out.println("0 - Exit");
			System.out.println("1 - Add new patient");
			System.out.println("2 - Patients registered");
			System.out.println();
			
			System.out.println("Choose option:");
			option = sc.nextInt();
			sc.nextLine();
			
			switch (option) {
			case ADD_PATIENT:
				Patient patient = new Patient();
				System.out.println("First name:");
				patient.setFirstName(sc.nextLine());
				System.out.println("Last name:");
				patient.setLastName(sc.nextLine());
				System.out.println("Identity number:");
				patient.setPersonalNumber(sc.nextLine());
				hospital.addPatient(patient);
				System.out.println();
				break;
			case PRINT_PATIENTS:
				System.out.println();
				hospital.printPatients();
				System.out.println();
				break;
			case EXIT:
				System.out.println("Program end!");
				break;
			default:
				System.out.println("You choose wrong option.");
				break;
			}
		}
		
		sc.close();
	}
}

/*
Klasa HospitalApp pozwala na komunikacj� z u�ytkownikiem. Logik� odpowiedzialn� za pobieranie danych od u�ytkownika i wy�wietlanie 
odpowiednich komunikat�w mogliby�my wydzieli� r�wnie� do osobnej klasy, jednak przy tak kr�tkim kodzie nie ma to wi�kszego znaczenia.

Po utworzeniu Scannera tworzymy zmienn� option, kt�ra b�dzie pozwala�a okre�li� jak� czynno�� chce wykona� u�ytkownik. 
Nast�pnie tworzymy nasz "szpital", czyli zmienn� typu Hospital, w kt�rej znajduje si� tablica z pacjentami.

Dalsza cz�� programu to p�tla while, kt�ra powtarzana jest tak d�ugo, a� u�ytkownik nie wprowadzi warto�ci 0, kt�ra spowoduje wyj�cie z p�tli, 
a tym samym zako�czenie programu. W sytuacji, gdy wybrana zostanie opcja 1 lub 2, u�ytkownik zostanie poproszony 
o dane nowego pacjenta lub wy�wietlona zostanie lista ju� zapisanych os�b.

Dla uproszczenia wszystkie trzy klasy znajduj� si� w 1 pakiecie, ale mo�esz je r�wnie� rozdzieli�.
*/