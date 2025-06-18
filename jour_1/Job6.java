package com.exemple;
import java.util.Scanner;

public class Job6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int somme = 0;
            int n = 0;

            while (n <5) {
                System.out.println("entrer un entier (" + (n+1) + "/5) :");
                somme += scanner.nextInt();
                n++;
            }
            double moyenne = somme /5.0;
            System.out.println("la moyenne est : "+moyenne);
        }
    }
}
