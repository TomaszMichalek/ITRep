package pl.javastart.sequentional_programming.control_flow;

public class UserIF {

	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UserIF(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}
}