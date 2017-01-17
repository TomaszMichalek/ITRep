package pl.javastart.sequentional_programming.loops;

import java.util.Scanner;

public class ForEachProblem {

	public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner sc = new Scanner(System.in);
         
        for(int tmp: numbers) {
            System.out.println("Podaj liczbê");
            tmp = sc.nextInt();
        }
         
        for(int tmp: numbers) {
            System.out.println(tmp);
        }
         
        sc.close();
    }
}

/*
Powy¿szy program pomimo i¿ mo¿emy spodziewaæ siê, ¿e wypisze na ekranie wprowadzone liczby, to jednak wyœwietla trzy zera. 
Spowodowane jest to tym, ¿e kolejne liczby przypisywaliœmy do zmiennej tmp, a nie do bezpoœrednio do tablicy.
*/