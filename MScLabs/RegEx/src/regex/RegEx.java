package regex;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) throws IOException {

    
        File file = new File("RegEx.txt");         
        Scanner in = new Scanner(file);

        List<List<String>> list = new ArrayList<>(); 
        
        for(int i=0; i<6; i++) {
            String string = in.nextLine();
            System.out.println(string);     
                    
            String[] parts = string.split("#");   
            
            List<String> listaTemp = new ArrayList<>(Arrays.asList(parts));     // Przepisuję tablicę do listy i listę przekazuję do konstruktora tworząc nową listę.
            
            list.add(listaTemp);
        }
               
        //Scanner input = new Scanner(System.in);
        
        //System.out.println("Enter IP address:");
        //String ip = input.nextLine();
        //System.out.println("Enter MAC address:");
        //String mac = input.nextLine();
        //System.out.println("Enter email address:");
        //String email = input.nextLine();
        //System.out.println("Write an example of Integers substraction");
        //String sub = input.nextLine();
        //System.out.println("Write an example of complex numbers addition");
        //String add = input.nextLine();
        //System.out.println("Write an example of real numbers multiplication");
        //String multiply = input.nextLine();
        
        Pattern ipPattern = Pattern.compile("^0*(25[0-5]|2[0-4]\\d|1?\\d\\d?)(\\.0*(25[0-5]|2[0-4]\\d|1?\\d\\d?)){3}$");
        Pattern macPattern = Pattern.compile("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");
        Pattern emailPattern = Pattern.compile("^[a-z0-9]+[\\.|\\_]?([a-z0-9]+)*\\@[a-z0-9]+(\\.[a-z0-9]+)*\\.[a-z]+$");
        Pattern subPattern = Pattern.compile("^-?[0-9]+[-]-?[0-9]+$");
        Pattern addPattern = Pattern.compile("^(-?[1-9]+)?[-+]?([0-9][i])?[+](-?[1-9]+)?[-+]?([0-9][i])?$");
        Pattern multiplyPattern = Pattern.compile("^(-?([0-9]+)(\\.[0-9]+)?)[*](-?([0-9]+)(\\.[0-9]+)?)$");

        System.out.println();
        for(String s: list.get(0)) { 
            System.out.print(s);            
            if (!ipPattern.matcher(s).matches()) {
                System.out.println(" - Invalid IP address");
            }
            else {
                System.out.println(" - Valid IP address");
            }
        }
        
        System.out.println();
        for(String s: list.get(1)) {
            System.out.print(s);
            if (!macPattern.matcher(s).matches()) {
                System.out.println(" - Invalid MAC address");
             }
            else {
                System.out.println(" - Valid MAC address");
            }
        }
        
        System.out.println();
        for(String s: list.get(2)) {
            System.out.print(s);
            if (!emailPattern.matcher(s).matches()) {
                System.out.println(" - Invalid email address");
            }
            else {
                System.out.println(" - Valid email address");
            }
        }
        
        System.out.println();
        for(String s: list.get(3)) {
            System.out.print(s);
            if (!subPattern.matcher(s).matches()) {
                System.out.println(" - Invalid example of Integers substraction");
            }
            else {
                System.out.println(" - Valid example of Integers substraction");
            }
        }
        
        System.out.println();
        for(String s: list.get(4)) {
            System.out.print(s);
            if (!addPattern.matcher(s).matches()) {
                System.out.println(" - Invalid example of complex numbers addition");
            }
            else {
                System.out.println(" - Valid example of complex numbers addition");
            }
        }
        
        System.out.println();
        for(String s: list.get(5)) {
            System.out.print(s);
            if (!multiplyPattern.matcher(s).matches()) {
                System.out.println(" - Invalid example of real numbers multiplication");
            }
            else {
                System.out.println(" - Valid example of real numbers multiplication");
            }
        }
    }
}