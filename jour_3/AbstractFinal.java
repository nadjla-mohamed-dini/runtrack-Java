package com.exemple;

public class AbstractFinal {
    public static void main(String[] args) {
        A [] tab = new A[3];
        tab[0] = new A();
        tab[1] = new B();
        tab[2] = new C();
        tab[1].b = 2;
        ((C)tab[2]).c = 3;

    }
}

abstract class A {
    int a;
}
class B extends A {
    int b;
}
class C extends A {
    final double c = 1;
}
abstract class D extends A {
    double d;
    int operation(int a) {
        return (a*2);
    }
    abstract int calcul (int b){

    }
}
// la classe A est abstraite donc ne peut pas creer un instance 
// on ne peut pas assigner une valeur a une variable final
//une methode abstraite ne peut pas avoir de body
// la variable b n'est pas accessible