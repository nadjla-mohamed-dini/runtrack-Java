package com.exemple;
import java.util.Scanner;

public class Job9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("entrer votre age: ");
            int age = scanner.nextInt();

            if (age< 18) {
                System.out.println("Vous etes mineur");
            } else {
                System.out.println("vous etes majeur");
            }
        }
    }
}