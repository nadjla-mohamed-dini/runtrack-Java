package com.exemple;
import java.util.Scanner;

public class Job5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.println("nombre 1: ");
            int a = scanner.nextInt();

            System.out.println("nombre 2: ");
            int b = scanner.nextInt();

            System.out.println("nombre 3: ");
            int c = scanner.nextInt();

            int max = Math.max(a, Math.max(b, c));

            System.out.println("le plus grand nombre est: "+max);
            
        }
    }
}