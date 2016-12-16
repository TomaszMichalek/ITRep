package pl.javastart.sequentional_programming.overloading_and_this;

public class Zad1Employee {

	String id;
	String firstName;
	String lastName;
	int age;
	int workExp;
	String role;

	Zad1Employee(String id, String fisrtName, String lastName, int age, int workExp, String role) {
		
		this.id = id;
		this.firstName = fisrtName;
		this.lastName = lastName;
		this.age = age;
		this.workExp = workExp;
		this.role = role;
	}
	
	Zad1Employee(Zad1Employee employee) {
		this(employee.id, employee.firstName, employee.lastName, employee.age, employee.workExp, employee.role);
	}
	
	void empInfo() {
		
		String info = firstName + " " + lastName + ": id - " + id + ", age - " + age + ", work experience - " + workExp + ", role - " + role;
		System.out.println(info);
	}
}