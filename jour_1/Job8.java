package com.exemple;
import java.util.Scanner;

public class Job8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("entrer un entier: ");
            int n = scanner.nextInt();
            int somme = 0;

            for (int i = 1; i<=n; i++){
                somme += i*i*i;
            }
            System.out.println("la somme des "+n+"premier cubes est : "+somme);
        }
    }
}