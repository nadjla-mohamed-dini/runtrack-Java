package com.exemple;

class Erreur_corriger {
    public static void main(String[] args) {
        E1 x = new E1();
        E2 y = new E2();
        E3 z = new E3();
        E4 w = new E4();

        System.out.println(x.a);
        System.out.println(z.c);
        System.out.println(z.b);
        System.out.println(z.a);
        System.out.println(w.a);
    }
}

class E1 {
    int a = 1;
}
class E2 extends E1 {
    int b = 2;
}
class E3 extends E2 {
    int c = 3;
}
class E4 extends E1 {
    int d = 4;
}
class E5 extends E4 {
    int e = 5;
}