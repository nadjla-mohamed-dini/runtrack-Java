package com.exemple;
import java.util.Scanner;

public class Job1{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){ // sa creer un scanner mettre try pour eviter a mettre close a la fin

            System.out.println("entrer quelque chose: ");
            String saisie = scanner.nextLine();

            System.out.println("vous avez entrer: "+saisie);
        }
    }
}