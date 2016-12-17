package laboratoriumlm1;

import java.util.Scanner;

public class LaboratoriumLM1 {

    public static void main(String[] args) {
        int [][] t = {
            {1,2,5},
            {2,3,6},
            {3,4,7},
            {4,5,0},
            {5,6,0},
            {6,7,0},
            {7,0,0},
            {0,0,0}
        }; 
        
        int pln;
        int stan=0;
        int n=-1;
        
        Scanner odczyt = new Scanner(System.in);
        
        while(true){          
            do{
                System.out.println("Wrzuć monetę: ");
                pln = odczyt.nextInt();
                switch(pln){
                    case 1:
                        n=0;
                        break;
                    case 2:
                        n=1;
                        break;
                    case 5:
                        n=2;
                        break;
                    default:
                        System.out.println("Podałeś nieprawidłowy nominał!");
                        break;
                }
            }while(pln!=1 & pln!=2 & pln!=5);
                        
            stan=t[stan][n];
            if(stan==0) System.out.println("Przekroczyłeś wartość nominalną. \nMonety zostały zwrócone.");
          
            System.out.println("Twój obecny stan to: " + stan + " zł.");
            if(stan==7) System.out.println("Osiągnąłeś wartość nominalną. Brawo!");
        }       
    }
}