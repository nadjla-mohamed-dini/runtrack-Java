package com.exemple;

public class Job10 {
    public static void main(String[] args) {
        int n = 8;
        int resultat = 1;

        for (int i =1; i<=n;i++) {
            resultat *=i;
        }
        System.out.println("la factorielle de " +n+"est: " + resultat);
    }
}