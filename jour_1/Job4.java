package com.exemple;
import java.util.Scanner;

public class Job4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("saisie un nombre: ");
            int saisie = scanner.nextInt();
            int carre = saisie * saisie;
            System.out.println("nombre au carré: "+carre);
        }
    }
}