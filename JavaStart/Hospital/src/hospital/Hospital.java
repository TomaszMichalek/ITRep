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
W klasie Hospital umieszczona jest g��wna logika programu. Mo�na powiedzie�, �e jest to nasz magazyn danych, 
w kt�rym b�dziemy przechowywali informacje o wszystkich pacjentach. Wykorzystamy do tego tablic� patients typu Patient[], 
kt�r� inicjujemy w konstruktorze nadaj�c jej rozmiar zgodny ze sta�� MAX_PATIENTS_NUM. Potrzebna b�dzie nam r�wnie� informacja o ilo�ci pacjent�w, 
kt�rzy faktycznie si� ju� zarejestrowali, st�d deklaracja dodatkowej zmiennej regPatients.

G��wna funkcjonalno�� programu to mo�liwo�� dodawania nowych pacjent�w - co udost�pniamy za pomoc� metody addPatient(), 
oraz wy�wietlanie informacji o zapisanych pacjentach - metoda printPatients(). W metodzie addPatient() przed zapisaniem 
kolejnej osoby najpierw sprawdzamy, czy jeszcze mamy w og�le miejsce (regPatients < MAX_PATIENTS_NUM) i w razie potrzeby wy�wietlamy komunikat o odmowie.

Poniewa� liczba zapisanych pacjent�w jest nam znana, to w metodzie printPatients() mo�emy zastosowa� bez obaw p�tl� for().
*/