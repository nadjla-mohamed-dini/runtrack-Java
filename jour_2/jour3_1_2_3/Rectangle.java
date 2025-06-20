package com.exemple;

public class Rectangle {
    protected double largeur;
    protected double longueur;

    public Rectangle (double largeur, double longueur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public double getLargeur() {
        return largeur;
    }
    public double getHauteur() {
        return longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
    public double surface() {
        return largeur * longueur;
    }

    public void affiche() {
        System.out.println("rectangle : "+largeur + "x" + longueur);
    }
}

