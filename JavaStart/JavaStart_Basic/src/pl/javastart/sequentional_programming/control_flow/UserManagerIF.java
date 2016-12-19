package pl.javastart.sequentional_programming.control_flow;

public class UserManagerIF {

	public static void main(String[] args) {

		UserIF user = new UserIF("Jan", "Kowakski");

		System.out.println("Wybierz opcj�:");
		System.out.println("0 - wyj�cie z programu");
		System.out.println("1 - wy�wietl informacje o u�ytkowniku");
		System.out.println("2 - modyfikuj dane u�ytkownika");

		int option = 0;
		
		if(option == 0) {
            System.out.println("Bye bye!");
        } else if(option == 1) {
            System.out.println("U�ytkownik: " + user.getFirstName() + " " + user.getLastName());
        } else if(option == 2) {
            user.setFirstName("Marian");
            user.setLastName("Powolny");
            System.out.println("Zmieniono dane u�ytkownika na: "+user.getFirstName()+" "+user.getLastName());
        }
	}
}