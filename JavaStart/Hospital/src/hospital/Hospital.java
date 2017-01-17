package hospital;

public class Hospital {
	public static final int MAX_PATIENTS_NUM = 10;
    private Patient[] patients;
    private int regPatients;
    
    public Hospital() {
    	patients = new Patient[MAX_PATIENTS_NUM];
    	regPatients = 0;
    }
    
    public void addPatient(Patient patient) {
    	if (regPatients < MAX_PATIENTS_NUM) {
    		patients[regPatients] = patient;
    		regPatients++;
    	} else {
    		System.out.println("Quantity of patients today reach maximum value. Please come again tomorrow.");
    	}
    }
    
    public void printPatients() {
    	for(int i=0; i<regPatients; i++) {
    		System.out.println(patients[i].getFirstName() + " " + patients[i].getLastName() + ", " + patients[i].getPersonalNumber());
    	}
    }
}

/*
W klasie Hospital umieszczona jest g³ówna logika programu. Mo¿na powiedzieæ, ¿e jest to nasz magazyn danych, 
w którym bêdziemy przechowywali informacje o wszystkich pacjentach. Wykorzystamy do tego tablicê patients typu Patient[], 
któr¹ inicjujemy w konstruktorze nadaj¹c jej rozmiar zgodny ze sta³¹ MAX_PATIENTS_NUM. Potrzebna bêdzie nam równie¿ informacja o iloœci pacjentów, 
którzy faktycznie siê ju¿ zarejestrowali, st¹d deklaracja dodatkowej zmiennej regPatients.

G³ówna funkcjonalnoœæ programu to mo¿liwoœæ dodawania nowych pacjentów - co udostêpniamy za pomoc¹ metody addPatient(), 
oraz wyœwietlanie informacji o zapisanych pacjentach - metoda printPatients(). W metodzie addPatient() przed zapisaniem 
kolejnej osoby najpierw sprawdzamy, czy jeszcze mamy w ogóle miejsce (regPatients < MAX_PATIENTS_NUM) i w razie potrzeby wyœwietlamy komunikat o odmowie.

Poniewa¿ liczba zapisanych pacjentów jest nam znana, to w metodzie printPatients() mo¿emy zastosowaæ bez obaw pêtlê for().
*/