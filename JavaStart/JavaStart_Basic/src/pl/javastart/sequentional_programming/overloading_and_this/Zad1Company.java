package pl.javastart.sequentional_programming.overloading_and_this;

public class Zad1Company {

	public static void main(String[] args) {
		
		Zad1Employee emp1 = new Zad1Employee("001-2016", "Tomasz", "Micha³ek", 24, 3, "Constuctor");
		Zad1Employee emp2 = new Zad1Employee("002-2016", "Dominik", "Lewandowski", 25, 2, "Boss");
		Zad1Employee emp3 = new Zad1Employee("003-2016", "Damian", "Lukas", 27, 1, "Manager");
		
		emp1.empInfo();
		emp2.empInfo();
		emp3.empInfo();
	}
}