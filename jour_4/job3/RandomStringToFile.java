package com.exemple;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomStringToFile {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // Début du chronomètre

        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la longueur de la chaîne aléatoire à générer : ");
        int length = scanner.nextInt();
        scanner.close();

        // Génération de la chaîne aléatoire
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder randomString = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            randomString.append(characters.charAt(random.nextInt(characters.length())));
        }

        // Écriture dans le fichier avec FileOutputStream
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(randomString.toString().getBytes());
            System.out.println("Chaîne générée et écrite dans output.txt avec succès.");
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
        }

        long endTime = System.currentTimeMillis(); // Fin du chronomètre
        long duration = endTime - startTime;

        System.out.println("Temps d'exécution : " + duration + " ms");
    }
}
