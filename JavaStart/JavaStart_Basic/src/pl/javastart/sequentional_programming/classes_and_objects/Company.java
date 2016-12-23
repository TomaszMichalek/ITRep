package pl.javastart.sequentional_programming.classes_and_objects;

/*
Napisz program, w kt�rym utworzysz dwie klasy:
- Employee - klasa, kt�ra b�dzie przedstawia�a pracownika dowolnej firmy. Podstawowe informacje o pracowniku, 
jakie s� potrzebne pracodawcy to imi�, nazwisko, rok urodzenia, sta� pracy
- Company - klasa, w kt�rej utworzysz 3 obiekty reprezentuj�ce pracownik�w, a nast�pnie wy�wietlisz informacj� o nich na ekranie
*/

public class Company {

	static Employee emp1;
	static Employee emp2;
	static Employee emp3;
	
	public static void main(String[] args) {

		emp1 = new Employee();
		emp1.name = "Tomasz";
		emp1.surname = "Micha�ek";
		emp1.dateOfBirth = "01.02.1992";
		emp1.workExp = 4;
		
		emp2 = new Employee();
		emp2.name = "Dominik";
		emp2.surname = "Lewandowski";
		emp2.dateOfBirth = "07.09.1991";
		emp2.workExp = 3;
		
		emp3 = new Employee();
		emp3.name = "Damian";
		emp3.surname = "Lukas";
		emp3.dateOfBirth = "12.08.1989";
		emp3.workExp = 2;
		
		String emp1Info = "Imi�: " + emp1.name + ", Naziwsko: " + emp1.surname + ", Data urodzenia: " + emp1.dateOfBirth 
				+ ", Sta� pracy: " + emp1.workExp;
		String emp2Info = "Imi�: " + emp2.name + ", Naziwsko: " + emp2.surname + ", Data urodzenia: " + emp2.dateOfBirth 
				+ ", Sta� pracy: " + emp2.workExp;
		String emp3Info = "Imi�: " + emp3.name + ", Naziwsko: " + emp3.surname + ", Data urodzenia: " + emp3.dateOfBirth 
				+ ", Sta� pracy: " + emp3.workExp;
		
		System.out.printf("%47s", "LISTA PRACOWNIK�W W FIRMIE");
		System.out.println();
		System.out.println("Pracownik 1:");
		System.out.println(emp1Info);
		System.out.println();
		System.out.println("Pracownik 2:");
		System.out.println(emp2Info);
		System.out.println();
		System.out.println("Pracownik 3:");
		System.out.println(emp3Info);
	}
}