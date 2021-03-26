package TP1;

/*11. Programa que lee por teclado el valor del radio de una circunferencia, calcula y
muestra por pantalla la longitud y el área de la circunferencia.*/

import java.util.PrimitiveIterator;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Clase11 {

    private double radio;

    public Clase11(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double perimetroCircunferencia(){
        return 2*PI*radio;
    }

    public double areaCircunferencia(){
        return PI*pow(radio,2);
    }
}
