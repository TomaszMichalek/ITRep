package hospital;

public class Patient {
	private String firstName;
	private String lastName;
	private String personalNumber;
	
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

	public String getPersonalNumber() {
		return personalNumber;
	}

	public void setPersonalNumber(String personalNumber) {
		this.personalNumber = personalNumber;
	}

	public Patient() {
		
	}
	
    public Patient(String firstName, String lastName, String personalNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setPersonalNumber(personalNumber);
    }
}

/*
Klasa Patient jest prosta, jej jedynym zadaniem jest odwzorowanie pojedynczego pacjenta i przechowywanie informacji o nim. 
Posiadamy trzy pola typu String pozwalaj¹ce przechowywaæ imiê, nazwisko oraz PESEL.
*/