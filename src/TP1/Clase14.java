package TP1;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/*14. Programa que calcula el volumen de una esfera.*/

public class Clase14 extends Clase11{

    public Clase14(double radio) {
        super(radio);
    }

    public double volumenDeEsfera() {
        return ((4.0/3.0) * PI * (Math.pow(radio,3)));

    }
}
