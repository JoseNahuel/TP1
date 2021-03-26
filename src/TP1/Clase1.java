package TP1;

/*1. Programa java que realice lo siguiente: declarar una variable N de tipo int, una
variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la
diferencia de A - N, el valor numérico correspondiente al carácter que contiene la
variable C.*/

import org.w3c.dom.ls.LSOutput;

public class Clase1 {

    private int N;
    private double A;
    private char C;

    public Clase1(int N, double A, char C){
        this.N = N;
        this.A = A;
        this.C = C;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public char getC() {
        return C;
    }

    public void setC(char c) {
        C = c;
    }

    public double suma(){
        return A+N;
    }

    public double resta(){
        return A-N;
    }

    public int valorASCIIdelChar(){
        int valor = C;
        return valor;
    }
}
