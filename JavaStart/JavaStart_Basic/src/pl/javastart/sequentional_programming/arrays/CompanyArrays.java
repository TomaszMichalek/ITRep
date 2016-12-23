package pl.javastart.sequentional_programming.arrays;

/*
Stwórzmy prosty program sk³adaj¹cy siê z dwóch klas:
- Employee - klasa reprezentuj¹ca pracownika (pola imiê, nazwisko i wyp³ata)
- Company - reprezentacja firmy, która przechowuje informacje o pracownikach
*/

public class CompanyArrays {

	public static void main(String[] args) {

		EmployeeArrays employees[] = new EmployeeArrays[20];
		
		employees[0] = new EmployeeArrays("Jan", "Nowak", 3500);
        employees[1] = new EmployeeArrays("Marta", "Ziêba", 3700);
        employees[2] = new EmployeeArrays("Karol", "Wojak", 4500);
        employees[3] = new EmployeeArrays("Patrycja", "Nowak", 2600);
        employees[4] = new EmployeeArrays("Wojciech", "Marczak", 3100);
        
        int employeeIndex = 2;
        System.out.println(employees[employeeIndex-1].getFirstName() + " " + 
                employees[employeeIndex-1].getLastName() + ": " +
                employees[employeeIndex-1].getSalary() + "z³");
        
        int employeesSize = employees.length;
        System.out.println("Wielkoœæ tablicy: " + employeesSize);
        System.out.println("Ostatni element tablicy to: " + employees[employeesSize-1]);
	}
}