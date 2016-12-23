package pl.javastart.sequentional_programming.arrays;

/*
Stw�rzmy prosty program sk�adaj�cy si� z dw�ch klas:
- Employee - klasa reprezentuj�ca pracownika (pola imi�, nazwisko i wyp�ata)
- Company - reprezentacja firmy, kt�ra przechowuje informacje o pracownikach
*/

public class CompanyArrays {

	public static void main(String[] args) {

		EmployeeArrays employees[] = new EmployeeArrays[20];
		
		employees[0] = new EmployeeArrays("Jan", "Nowak", 3500);
        employees[1] = new EmployeeArrays("Marta", "Zi�ba", 3700);
        employees[2] = new EmployeeArrays("Karol", "Wojak", 4500);
        employees[3] = new EmployeeArrays("Patrycja", "Nowak", 2600);
        employees[4] = new EmployeeArrays("Wojciech", "Marczak", 3100);
        
        int employeeIndex = 2;
        System.out.println(employees[employeeIndex-1].getFirstName() + " " + 
                employees[employeeIndex-1].getLastName() + ": " +
                employees[employeeIndex-1].getSalary() + "z�");
        
        int employeesSize = employees.length;
        System.out.println("Wielko�� tablicy: " + employeesSize);
        System.out.println("Ostatni element tablicy to: " + employees[employeesSize-1]);
	}
}