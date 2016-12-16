package pl.javastart.sequentional_programming.methods_and_constructors;

public class Zad1Employee {

	String id;
	String firstName;
	String lastName;
	int age;
	int workExp;
	String role;

	Zad1Employee(String empId, String empFisrtName, String empLastName, int empAge, int empWorkExp, String empRole) {
		
		id = empId;
		firstName = empFisrtName;
		lastName = empLastName;
		age = empAge;
		workExp = empWorkExp;
		role = empRole;
	}
	
	void empInfo() {
		
		String info = firstName + " " + lastName + ": id - " + id + ", age - " + age + ", work experience - " + workExp + ", role - " + role;
		
		System.out.println(info);
	}
}