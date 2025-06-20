package com.exemple;

public class Jour2_job1 {
    int toto = 0;

    public Jour2_job1() {
        toto = toto +1;
    }
    public static void main(String[] tutu) {
        Jour2_job1 t1 = new Jour2_job1();
        Jour2_job1 t2 = new Jour2_job1();
        System.out.println("Jour2_job1: "+toto);
    }
    
}
//erreur non-static variable toto cannot be referenced from a static 