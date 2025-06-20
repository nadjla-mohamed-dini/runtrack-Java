package com.exemple;

public class FiguresGeometriques {
    public static class Cercle {
        private double x;
        private double y;
        private double rayon;
        

        public Cercle(double x, double y, double rayon){
            this.x = x;
            this.y = y;
            this.rayon = rayon;
        }
        // afficher les infos du cercle
        public void affiche(){
            System.out.println("Cercle de centre (" + x +","+ y +") et de rayon"+ rayon);
        }
        //getter
        public double getX() {
            return x;
        }
        public double getY() {
            return y;
        }
        public double getRayon() {
            return rayon;
        }
        //setter
        public void setX(double x) {
            this.x = x;
        }
        public void setY(double y) {
            this.y = y;
        }
        public void setRayon(double rayon) {
            this.rayon = rayon;
        }

        public double surface() {
            return Math.PI * rayon * rayon;
        }

        public boolean estInterieur (double px, double py) {
            double dx = px - x;
            double dy = py - y;
            return dx * dx + dy * dy <= rayon * rayon;

        }

        public static void main(String[] args) {
            Cercle c = new Cercle(2.0,5.0,7.0);
            c.affiche();
            System.out.println("Surface : "+c.surface());
            System.out.println("Point (4,2) à l'interieur ?" + c.estInterieur(4.0,2.0));
        }
    }    
}