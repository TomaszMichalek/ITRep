package hospital;

import java.util.Scanner;

/*
Napisz program symuluj¹cy system do planowania wizyt w szpitalu. Program powinien sk³adaæ siê z trzech klas:
- Patient - klasa przechowuj¹ca dane o pacjencie (imiê, nazwisko, PESEL) - klasa powinna byæ zgodna z konwencj¹ JavaBeans
- Hospital - klasa z logik¹ aplikacji umo¿liwiaj¹ca dopisanie pacjenta do kolejki oraz wyœwietlenie wszystkich zapisanych pacjentów
- HospitalApp - klasa startowa programu, która posiada trzy opcje: 0 - wyjœcie z programu, 1 - dopisanie pacjenta, 2 - wyœwietlenie listy pacjentów

Ograniczenia:
Danego dnia mo¿e zapisaæ siê co najwy¿ej 10 pacjentów, przy próbie zapisania kolejnego wyœwietlana jest informacja o tym, 
¿e dzisiaj limit zosta³ ju¿ wyczerpany. Aplikacja powinna dzia³aæ do tego momentu, a¿ u¿ytkownik nie wybierze opcji 0, czyli wyjœcia z programu.
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
Klasa HospitalApp pozwala na komunikacjê z u¿ytkownikiem. Logikê odpowiedzialn¹ za pobieranie danych od u¿ytkownika i wyœwietlanie 
odpowiednich komunikatów moglibyœmy wydzieliæ równie¿ do osobnej klasy, jednak przy tak krótkim kodzie nie ma to wiêkszego znaczenia.

Po utworzeniu Scannera tworzymy zmienn¹ option, która bêdzie pozwala³a okreœliæ jak¹ czynnoœæ chce wykonaæ u¿ytkownik. 
Nastêpnie tworzymy nasz "szpital", czyli zmienn¹ typu Hospital, w której znajduje siê tablica z pacjentami.

Dalsza czêœæ programu to pêtla while, która powtarzana jest tak d³ugo, a¿ u¿ytkownik nie wprowadzi wartoœci 0, która spowoduje wyjœcie z pêtli, 
a tym samym zakoñczenie programu. W sytuacji, gdy wybrana zostanie opcja 1 lub 2, u¿ytkownik zostanie poproszony 
o dane nowego pacjenta lub wyœwietlona zostanie lista ju¿ zapisanych osób.

Dla uproszczenia wszystkie trzy klasy znajduj¹ siê w 1 pakiecie, ale mo¿esz je równie¿ rozdzieliæ.
*/