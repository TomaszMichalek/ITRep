package pl.javastart.sequentional_programming.control_flow;

public class UserManagerIF {

	public static void main(String[] args) {

		UserIF user = new UserIF("Jan", "Kowakski");

		System.out.println("Wybierz opcjê:");
		System.out.println("0 - wyjœcie z programu");
		System.out.println("1 - wyœwietl informacje o u¿ytkowniku");
		System.out.println("2 - modyfikuj dane u¿ytkownika");

		int option = 0;
		
		if(option == 0) {
            System.out.println("Bye bye!");
        } else if(option == 1) {
            System.out.println("U¿ytkownik: " + user.getFirstName() + " " + user.getLastName());
        } else if(option == 2) {
            user.setFirstName("Marian");
            user.setLastName("Powolny");
            System.out.println("Zmieniono dane u¿ytkownika na: "+user.getFirstName()+" "+user.getLastName());
        }
	}
}