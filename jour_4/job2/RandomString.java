package com.exemple;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la longueur de la chaîne à générer : ");
        int length = scanner.nextInt();
        scanner.close();

        long startTime = System.currentTimeMillis();

        String randomString = generateRandomString(length);

        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(randomString.getBytes());
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
            return;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Chaîne générée et écrite dans output.txt");
        System.out.println("Temps d'exécution : " + (endTime - startTime) + " ms");
    }

    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(characters.charAt(random.nextInt(characters.length())));
        }
        return sb.toString();
    }
}
