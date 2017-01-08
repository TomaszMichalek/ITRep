package turing.machine;

import java.util.Scanner;

public class TuringMachine {

    // Tworzę tablicę z zadania za pomocą pól z klasy Operations.      
    private static Operations[][] multiArray = {
    //                      0                          1                        epsilon
        {new Operations(1, '1', 1), new Operations(0, '0', -1), new Operations(1, '1', 1)},     // q0
        {new Operations(1, '-', 1), new Operations(1, '-', 1), new Operations(2, '-', -2)},     // q1
        {new Operations(3, '1', 0), new Operations(2, '0', -1), new Operations(3, '1', 0)},     // q2
        {new Operations(3, '-', 0), new Operations(3, '-', 0), new Operations(4, '-', 0)},      // q3
    };
    
    // Tworzę metodę do wyświetlenia informacji o obecnym stanie.
    private static void show(int currentState, int headPosition, int currentCharacter, StringBuilder output) {
        System.out.println("Current state: q" + currentState);
        System.out.println("Head position: " + headPosition + "[" + currentCharacter + "]");
        System.out.println("Tape state: " + output.toString());
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        int currentState = 0;       // Deklaruję stan, w którym zaczynam.
        String states = "q" + currentState + " ";       // Deklaruję Stringa, który będzie reprezentwoał listę odwiedzonych stanów.
        
        // Pobieram liczbę od użytkownika.
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        String input = "2" + read.nextLine() + "2";     // 2 oznacza pusty znak, a cały input to: epsilon/liczba/epsilon.
        
        int headPosition = input.length() - 2;          // Głowica ustawia się na 1 indeksie od prawej czyli za epsilonem (pamiętam że ostatni indeks to length - 1).
        
        StringBuilder output = new StringBuilder(input);    // Klasa, która w konstruktorze przyjumje Stringa i pozwala na jego manipulację.
                                                            // Używam go żeby podmienić znaki na określonym indeksie. Output to jest cały String czyli cała liczba binarna.
                                                            // czy ten output to tamten output
        Operations operations;      
        int currentCharacter;       // Znak, na który obecnie wskazuje głowica.
        
        do {
            currentCharacter = Integer.parseInt(output.charAt(headPosition) + "");  // output.charAt zwraca mi znak na indeksie, w którym jest headPosition, 
                                                                                    // na początku zwraca pierwszy znak po pustym znaku, dodaje pusty znak żeby przekonwertować 
                                                                                    // chara do Stringa, Integer.parseInt przyjmuje Stringa, z tego zwrócony jest 1 znak po epsilonie.
            show(currentState, headPosition, currentCharacter, output);       
            operations = multiArray[currentState][currentCharacter];
            char charToSet = operations.getValue();     // Pobieram wartość, którą będę zmieniał (2 pole w konstruktorze), jezeli jest '-' to nic nie robię.
            if (charToSet != '-') {
                output.setCharAt(headPosition, charToSet);      // Powoduje to, że na Stringu output na indeksie headPosition zostanie ustawiony znak chatToSet.
            }
            headPosition += operations.getMove();       // Do obecnego indexu dodaje wartość reprezentującą przesunięcie głowicy.
            currentState = operations.getNextState();   // Stan, do którego przechodzę.
            states += "q" + currentState + " ";         // Dopisuję do listy stanów, przez które przechodzę.
        }
        while (currentState != 3);
        show(currentState, headPosition, currentCharacter, output);  
        System.out.println(states);
    }
}