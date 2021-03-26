package TP1;

/*15. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.*/

public class Clase15{

    private double lado1;
    private double lado2;
    private double lado3;


    public Clase15(double l1, double l2, double l3) {
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public double areDeTriangulo(){

        double semiper = ((lado1+lado2+lado3)/2.0);

        return Math.sqrt(semiper*(semiper-lado1)*(semiper-lado2)*(semiper-lado3));
    }
}
