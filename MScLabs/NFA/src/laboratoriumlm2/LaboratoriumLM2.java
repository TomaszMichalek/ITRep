package laboratoriumlm2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LaboratoriumLM2 {

    public static void main(String[] args) throws FileNotFoundException {
        Integer [][][] t = {
            {{0,1},{0,2},{0,3},{0,4},{0,5},{0,6},{0,7},{0,8},{0,9},{0,10}},
            {{11},{1},{1},{1},{1},{1},{1},{1},{1},{1}},
            {{2},{11},{2},{2},{2},{2},{2},{2},{2},{2}},
            {{3},{3},{11},{3},{3},{3},{3},{3},{3},{3}},
            {{4},{4},{4},{11},{4},{4},{4},{4},{4},{4}},
            {{5},{5},{5},{5},{11},{5},{5},{5},{5},{5}},
            {{6},{6},{6},{6},{6},{11},{6},{6},{6},{6}},
            {{7},{7},{7},{7},{7},{7},{11},{7},{7},{7}},
            {{8},{8},{8},{8},{8},{8},{8},{11},{8},{8}},
            {{9},{9},{9},{9},{9},{9},{9},{9},{11},{9}},
            {{10},{10},{10},{10},{10},{10},{10},{10},{10},{11}},
            {{11},{11},{11},{11},{11},{11},{11},{11},{11},{11}},
        }; 
        
        File file = new File("LMlab2.txt");          // tworzę obiekt pliku txt odwzoroway w Javie
         Scanner in = new Scanner(file);

         String zdanie = in.nextLine();
         System.out.println(zdanie);
      
        List<String> lista = new ArrayList<>();     // deklaruję listę do której będę wpisywał poszczególne ciągi znaków           
        
        String[] parts = zdanie.split("#");         // parts odseparowuje wyrazy oddzielone #
        for(String y : parts) {
            lista.add(y);
            // System.out.println(y);
        }
      
        for(String x : lista) {
            int n = 0;
            List<Integer> stan = new ArrayList<>();
            stan.add(0);
            
            for(char c : x.toCharArray()) {         // pętla dla pojedynczych znaków w zdaniu
                switch(c){
                    case '0':
                        n=0;
                        break;
                    case '1':
                        n=1;
                        break;
                    case '2':
                        n=2;
                        break;
                    case '3':
                        n=3;
                        break;
                    case '4':
                        n=4;
                        break;
                    case '5':
                        n=5;
                        break;
                    case '6':
                        n=6;
                        break;
                    case '7':
                        n=7;
                        break;
                    case '8':
                        n=8;
                        break;
                    case '9':
                        n=9;
                        break;
                    default:
                        System.out.println("Podałeś nieprawidłowy znak!");
                        break;
                }
                
            List<Integer> stanTemp = new ArrayList<>();
            for(int st : stan){
                stanTemp.addAll(Arrays.asList(t[st][n]));
            }
            stan=stanTemp;
            System.out.println("Znak: " + c + ", Stan po: " + stan);
            }
            // System.out.println(x);
            if(stan.contains(11)) {
                System.out.println("Zdanie " + x + " jest akceptowalne");
            }
            else {
                System.out.println("Zdanie " + x + " nie jest akceptowalne");
            }            
        }           
    }
}